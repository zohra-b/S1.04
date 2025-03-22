package org;

import org.books_manager.Book;
import org.books_manager.BooksManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BooksManager myLibrary = new BooksManager();

        myLibrary.addBook("Joshua Bloch" , "Effective Java");

        List<Book> newList = new ArrayList<>();
        Book b1 = new Book("Author1" , "Title1");
        Book b2 = new Book("Author2" , "Title2");
        Book b3 = new Book("Author3" , "Title3");
        newList.add(b1);
        newList.add(b2);
        newList.add(b3);
        myLibrary.addBooks(newList);

        myLibrary.addBookAt(1, "Author 4", "Book added at index 1");
        System.out.println(myLibrary.getBooks());

        myLibrary.removeBookByTitle("Title2");
        System.out.println(myLibrary.getBooks());

        System.out.println(myLibrary.getTitleByIndex(0));


    }
}