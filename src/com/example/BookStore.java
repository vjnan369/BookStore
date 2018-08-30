package com.example;

import java.util.ArrayList;

public class BookStore {
    private ArrayList<Stock> books;
    private String storeArea;
    private int totalBooks;

    BookStore() {
        this.books = new ArrayList<Stock>();
        this.totalBooks = 0;
        this.storeArea = "500sft";
    }

    ArrayList<Stock> getBooksList() {
        return books;
    }

    String getStoreArea() {
        return storeArea;
    }

    public void returnBook(String str) {
        Stock stock = null;
        ArrayList<Stock> books = getBooksList();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(str)) {
                stock = books.get(i);
                break;
            }
        }
        if (stock != null) {
            stock.addQuantity(1);
        }
    }


    public void purchaseBook(String str) {
        Stock stock = null;
        ArrayList<Stock> books = getBooksList();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(str)) {
                stock = books.get(i);
                break;
            }
        }
        stock.removeQuatity(1);
    }

    int getTotalBooks() {
        return totalBooks;
    }

    String getStockDispatch() {
        return Book.stockDispatch;
    }

    Stock getBookDetails(String str) {
        ArrayList<Stock> books = getBooksList();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(str)) {
                return books.get(i);
            }
        }
        return null;
    }

}
