package W8;

public class BookTest implements Cloneable {
    String title;
    int[] pageNumbers;

    BookTest(String title, int[] pgNo) {
        this.title = title;
        pageNumbers = pgNo;
    }

    public BookTest clone() throws CloneNotSupportedException {
        BookTest cloned = (BookTest) super.clone(); // shallow copy

        cloned.pageNumbers = this.pageNumbers.clone();
        return cloned;
    }

    public String toString() {
        return title + " " + pageNumbers[0];
    }

    public static void main(String[] args) {
        int[] pgNo = { 2, 3, 4, 5, 56, 7, 8 };

        BookTest b1 = new BookTest("Book 1", pgNo);

        try {
            BookTest b2 = b1.clone();
            b2.pageNumbers[0] = 20;
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(b1);

    }
}
