package com.example.books;

import com.example.exceptions.OutofStockException;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Jnan Bookstore!");
        System.out.println("Select 1 for purchase a new Book");
        System.out.println("Select 2 to count number of books");
        System.out.println("Select 3 for Show given Book Details");
        System.out.println("Select 4 to to get the store name");
        System.out.println("Select 5 to to show all book details");
        System.out.println("Select 0 to Exit");
        Store store = new BookStore("1009");
        store.add(new History("Gandhi", "10214", 300.0, "Sam"));
        store.add(new Humour("The chaplin", "10114", 200.0, "Chaplin"));
        store.add(new SciFi("Interstellar", "10200", 500.0, "Nolan"));
        store.add(new Biography("Wings of Fire", "10201", 100.0, "Kalam"));
        store.add(new Biography("Playing it my way", "10202", 800.0, "Sachin"));

        int userChoice = -1;
        do {
            System.out.print("Enter Your Choice: ");
            userChoice = s.nextInt();
            s.nextLine();
            try {
                switch (userChoice) {
                    case 1:
                        System.out.print("Enter book id to purchase:");
                        String newBookId = s.nextLine();
                        store.purchase(newBookId);
                        break;
                    case 2:
                        System.out.println("Number of books are: " + store.getBooksCount());
                        break;
                    case 3:
                        System.out.print("Enter book id to show the details: ");
                        String bookId = s.nextLine();
                        System.out.println("Book Details are:");
                        getBookDetails(bookId, store);
                        break;
                    case 4:
                        System.out.println("Store Id is: " + store.getStoreId());
                        break;
                    case 5:
                        System.out.println("================List of Books are========================");
                        getAllBookDetails(store);

                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please provide proper input details");
            } catch (OutofStockException e) {
                System.out.println("Given book is not found");
            }
        } while (userChoice != 0);

    }

    static void getBookDetails(String bookId, Store store) throws OutofStockException {
        Book bookDetails = store.getBookDetails(bookId);
        System.out.println("Book Title:" + bookDetails.getTitle());
        System.out.println("Book Id:" + bookDetails.getBookId());
        System.out.println("Book Author:" + bookDetails.getAuthor());
        System.out.println("Book Price:" + bookDetails.getPrice());
    }

    static void getAllBookDetails(Store store) {
        List<Book> books = store.getAllBooks();
        System.out.println("Title         Id        Author         Price");
        for (Book book : books) {
            System.out.println(book.getTitle() + "       " + book.getBookId() + "    " + book.getAuthor() + "     " + book.getPrice());
        }
    }
}
