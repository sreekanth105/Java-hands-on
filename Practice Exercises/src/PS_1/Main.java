package PS_1;

import java.util.ArrayList;

public class Main {
    public static void createBooks(ArrayList<Book> books, String title, double price) {
        Book book = new Book(title, price);
        books.add(book);
    }

    public static void showBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Adding a book
        createBooks(books, "Java Programming", 350.00);

        // Showing books
        showBooks(books);
    }
}
