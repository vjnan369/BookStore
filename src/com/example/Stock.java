package com.example;

interface Stock {
    String stockDispatch = "Hyderabad";
    int getQuantity();
    Double getPrice();
    String getTitle();
    void removeQuatity(int quantity);
    void addQuantity(int quantity);
}
