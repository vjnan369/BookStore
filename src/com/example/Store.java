package com.example;

import java.util.List;

public interface Store {
    void add(Book book);
    Book getBookDetails(String bookId);
    int getBooksCount();
    void purchase(String bookId);
    String getStoreId();
    List<Book> getAllBooks();
}
