package W4;

interface PizzaReadyCallback {
    void onPizzaReady(String pizza);
}

class PizzaShop {
    void makePizza(PizzaReadyCallback cb) {
        System.out.println("Baking Pizza");
        cb.onPizzaReady("Margehrita");
    }
}

public class CallbacksTest {
    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();

        // callbacks
        PizzaReadyCallback ob = new PizzaReadyCallback() {
            public void onPizzaReady(String pizza) {
                System.out.println("Got callback: " + pizza);
            }
        };

        shop.makePizza(ob);

        // new syntax 
        shop.makePizza(new PizzaReadyCallback() {
            public void onPizzaReady(String pizza) {
                System.out.println("Got callback: " + pizza);
            }
        });


        // new syntax for doing the same thing
    }
}