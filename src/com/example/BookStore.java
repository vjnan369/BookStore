package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookStore implements Store{
    private List<Book> books = new ArrayList<Book>();
    private String storeId;

    BookStore(String storeId) {
        this.storeId = storeId;
    }

    public void add(Book book) {
        books.add(book);
    }

    public Book getBookDetails(String bookId) {
        for(Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        throw new NoSuchElementException("Unable to find given book");
    }

    public int getBooksCount(){
        return books.size();
    }

    public String getStoreId() {
        return storeId;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public void purchase(String bookId) {
        Book purchaseBook = null;
        for(Book book : books) {
            if(book.getBookId().equals(bookId)) {
                purchaseBook = book;
                break;
            }
        }
        if (purchaseBook == null) {
            throw new NoSuchElementException("Unable to find given element");
        }
        int index = books.indexOf(purchaseBook);
        if(index != -1) {
            books.remove(purchaseBook);
        }else {
            throw new NoSuchElementException("Unable to find given book");
        }

    }
}
