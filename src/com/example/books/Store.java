package com.example.books;

import com.example.exceptions.OutofStockException;

import java.util.List;

public interface Store {
    void add(Book book);

    Book getBookDetails(String bookId) throws OutofStockException;

    int getBooksCount();

    void purchase(String bookId) throws OutofStockException;

    String getStoreId();

    List<Book> getAllBooks();
}
