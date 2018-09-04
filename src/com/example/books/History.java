package com.example.books;

public class History implements Book {
    String title;
    String bookId;
    Double price;
    String author;

    History(String title, String bookId, Double price, String author){
        this.title = title;
        this.bookId = bookId;
        this.price = price;
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }
}
