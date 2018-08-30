package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Jnan Bookstore!");
        BookStore bookStore = new BookStore();
        ArrayList<Stock> stocks = bookStore.getBooksList();
        System.out.println("Select 1 for Adding a new Book");
        System.out.println("Select 2 for Listing all Book");
        System.out.println("Select 3 for Show given Book Details");
        System.out.println("Select 4 to know the stock dispatch area");
        System.out.println("Select 5 to purchase a book ");
        System.out.println("Select 6 to return a book ");
        System.out.println("Select 0 to Exit");
        int userChoice;
        do {
            System.out.print("Enter Your Choice: ");
            userChoice = s.nextInt();
            s.nextLine();
            switch (userChoice) {
                case 1:
                    addBook(s, bookStore, stocks);
                    break;
                case 2:
                    System.out.println("List of Books");
                    System.out.println("==============================================");
                    System.out.println("NAME     PRICE    QUANTITY");
                    System.out.println("==============================================");
                    for(int i = 0; i<stocks.size(); i++) {
                        System.out.println(stocks.get(i).getTitle()+ "    "+ stocks.get(i).getPrice() +"      "+ stocks.get(i).getQuantity());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter book Title: ");
                    String str = s.nextLine();
                    getBookDetails(str, s, bookStore);
                    break;
                case 4:
                    System.out.print("Stock Dispatch Area is : ");
                    System.out.println(bookStore.getStockDispatch());
                    break;
                case 5:
                    System.out.print("Enter Book name to Buy:");
                    String purchaseBook = s.nextLine();
                    bookStore.purchaseBook(purchaseBook);
                    System.out.println("Book Purchased Successfully!");
                    break;
                case 6:
                    System.out.print("Enter Book name to Return:");
                    String returnBook = s.nextLine();
                    bookStore.returnBook(returnBook);
                    System.out.println("Book Returned Successfully!");
            }
        } while (userChoice != 0);

    }

    static void addBook(Scanner s, BookStore bookStore, ArrayList<Stock> stocks) {
        System.out.print("Enter Book Title: ");
        String title = s.nextLine();
        System.out.print("Enter Book Price: ");
        Double price = s.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantiy = s.nextInt();
        Book newBook = new Book(title, price, quantiy);
        stocks.add(newBook);
        System.out.println("Book Added SuccessFully!");
    }

    static void getBookDetails(String str, Scanner s, BookStore bookStore) {
        Stock stock = bookStore.getBookDetails(str);
        if (stock != null) {
            System.out.println("Book Details are: ");
            System.out.println("Book Title: " + stock.getTitle());
            System.out.println("Book Price: "+ stock.getPrice());
            System.out.println("Book Quantity: " + stock.getQuantity());

        } else {
            System.out.println("No book available with given name!");
        }
    }


}
