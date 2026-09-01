package W11;

public class ProducerConsumerTest {

    static class SharedBuffer {
        private int data;
        private boolean availableLock = false;

        // product()
        public synchronized void product(int val) throws InterruptedException {
            while (availableLock) {
                wait(); // --> wait until the consumer has taken the previous value
            }
            data = val;
            availableLock = true; // acquire the lock
            System.out.println("Produced: " + val);
            notifyAll(); // wait() --> runnable
        }

        // consume()
        public synchronized int consume() throws InterruptedException {
            while (!availableLock) {
                wait(); // wait until there's something to be consumed
            }
            availableLock = false;
            System.out.println("Consumed: " + data);
            notifyAll();
            return data;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.product(i);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        consumer.start();
        // Thread.sleep(300);

        producer.start();

        producer.join();
        consumer.join();
    }
}
