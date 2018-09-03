package com.example;

public class Humour implements Book {
    String title;
    String bookId;
    Double price;
    String author;

    Humour(String title, String bookId, Double price, String author){
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
