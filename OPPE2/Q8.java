package OPPE2;

import java.util.Scanner;
import java.util.ArrayList;

// Define class PublicationYearOutOfBoundsException

class PublicationYearOutOfBoundsException extends Exception {
    PublicationYearOutOfBoundsException(String msg) {
        super(msg);
        // super("Publication year of " + title + "is outside the acceptable range");
    }
}

class Book {
    private String title;
    private int publicationYear;

    public Book(String t, int year) {
        title = t;
        publicationYear = year;
    }

    // Complete definition of method checkAndGetTitle
    public String checkAndGetTitle() throws PublicationYearOutOfBoundsException {
        // condition
        if (publicationYear < 2000 || publicationYear > 2022) {
            throw new PublicationYearOutOfBoundsException(
                    "Publication year of \"" + title + "\" is outside the acceptable range");
        }
        return title;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Book b = new Book(sc.next(), sc.nextInt());
            bookList.add(b);
        }
        for (Book b : bookList) {
            try {
                String title = b.checkAndGetTitle();
                System.out.println(title);
            } catch (PublicationYearOutOfBoundsException pe) {
                System.out.println(pe.getMessage());
            }
        }
        sc.close();
    }
}
