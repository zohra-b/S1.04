package org.books_manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooksManagerTest {
    BooksManager myBookManager;
    @BeforeEach
    void setUp() {
        myBookManager = new BooksManager();
        List<Book> newList = new ArrayList<>();
        Book b1 = new Book("Author1" , "Title1");
        Book b2 = new Book("Author2" , "Title2");
        Book b3 = new Book("Author3" , "Title3");
        newList.add(b1);
        newList.add(b2);
        newList.add(b3);
        myBookManager.addBooks(newList);
    }

    @Test
    void getBooks() {
        List<Book> booksList = myBookManager.getBooks();
        assertEquals(3, booksList.size(), "the arrayList should have a size of 3");
        assertEquals("Author1", booksList.get(0).getAuthor(), "The author should be \"Author1\"");
        assertEquals("Title2", booksList.get(1).getTitle());
        for (Book b : booksList) {
            assertInstanceOf(Book.class, b, "the list should only contain Book objects");
        }
    }



    @Test
    void addBook() {
        myBookManager.addBook("Name Surname", "Title" );
        List<Book> booksList = myBookManager.getBooks();
        assertEquals(4, booksList.size(), "the arrayList should have a size of 4");
        assertEquals("Name Surname", booksList.get(3).getAuthor(), "The author should be \"Name Surname\"");
        assertEquals("Title", booksList.get(3).getTitle());


    }

    @Test
    void addBooks() {
        List<Book> newList = new ArrayList<>();
        Book b1 = new Book("Author4" , "Title4");
        Book b2 = new Book("Author5" , "Title5");
        Book b3 = new Book("Author6" , "Title6");
        newList.add(b1);
        newList.add(b2);
        newList.add(b3);
        myBookManager.addBooks(newList);
        List<Book> booksList = myBookManager.getBooks();
        assertEquals(6, booksList.size(), "the arrayList should have a size of 6");
        assertEquals("Author4", booksList.get(3).getAuthor(), "The author should be \"Author4\"");
        assertEquals("Title4", booksList.get(3).getTitle(), "The author should be \"Title4\"");
    }

    @Test
    void addBookAt() {
        myBookManager.addBookAt(1, "New Author", "New Book");
        List<Book> booksList = myBookManager.getBooks();
        assertEquals(4, booksList.size(), "\"the arrayList should have a size of 4");
        assertAll("Book added at index 1",
                () -> assertEquals("New Author", booksList.get(1).getAuthor()),
                () -> assertEquals("New Book", booksList.get(1).getTitle())
        );
    }

    @Test
    void removeBookByTitle() {
        myBookManager.removeBookByTitle("Title3");
        List<Book> booksList = myBookManager.getBooks();
        assertEquals(2, booksList.size(), "\"the arrayList should have a size of 2");
        assertFalse(booksList.contains(new Book("Author3", "Title3")), "The list shouldnt contain a book untitled \"Title3\"");
    }

    @Test
    void getTitleByIndex() {
        List<Book> booksList = myBookManager.getBooks();
        myBookManager.getTitleByIndex(1);
        assertEquals("Author2", booksList.get(1).getAuthor(), "The author should be \"Author2\"");
        assertEquals("Title2", booksList.get(1).getTitle(), "The author should be \"Title2\"");
    }
}