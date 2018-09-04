package com.example.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import com.example.exceptions.OutofStockException;

public class BookStore implements Store{
    private List<Book> books = new ArrayList<Book>();
    private String storeId;

    BookStore(String storeId) {
        this.storeId = storeId;
    }

    // will add a new book to the store
    public void add(Book book) {
        books.add(book);
    }

    // To get the book details of given bookid
    public Book getBookDetails(String bookId) throws OutofStockException {
        for(Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        throw new OutofStockException("Unable to find given book");
    }


    // returns the total number of books available in store
    public int getBooksCount(){
        return books.size();
    }

    // returns store id of invoked object
    public String getStoreId() {
        return storeId;
    }

    // returns List of all books available in store.
    public List<Book> getAllBooks() {
        return Collections.unmodifiableList(books);
    }

    // removes the purchased book from store
    // if the book is not available to purchase, it will throw an error.
    public void purchase(String bookId) throws OutofStockException {
        Book purchaseBook = null;
        for(Book book : books) {
            if(book.getBookId().equals(bookId)) {
                purchaseBook = book;
                break;
            }
        }
        if (purchaseBook == null) {
            throw new OutofStockException("Unable to find given element");
        }
        int index = books.indexOf(purchaseBook);
        if(index != -1) {
            books.remove(purchaseBook);
        }else {
            throw new NoSuchElementException("Unable to find given book");
        }

    }
}
