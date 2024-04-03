package PS_1;

import java.util.ArrayList;

class Book {
    private String bookTitle;
    private double bookPrice;

    // Constructor
    public Book(String title, double price) {
        this.bookTitle = title;
        this.bookPrice = price;
    }

    // Getter and Setter for bookTitle
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    // Getter and Setter for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double price) {
        this.bookPrice = price;
    }
}



