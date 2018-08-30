package com.example;

public class Book implements Stock{
    private int quantity = 0;
    private String title;
    private Double price;

    Book(String title, Double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void removeQuatity(int quantity) {
        this.quantity -= quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

}
