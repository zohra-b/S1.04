package org.books_manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BooksManager {
    List<Book> books;

    public BooksManager(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public void addBook(String author, String title){
        books.add(new Book(author, title) )  ;
    }

    public void addBooks(List<Book> newListOfBooks){
        books.addAll(newListOfBooks);
    }

    public void addBookAt(int i , String author, String title ){
        books.add(i, new Book(author, title));
    }

    public void removeBookByTitle(String title){
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            if(it.next().getTitle().equalsIgnoreCase(title)){
                it.remove();
            }

        }
        for (Book b : books){
            if ( b.getTitle().equalsIgnoreCase(title)){
                books.remove(b);
            }
        }
    }

    public String getTitleByIndex(int i){
        return books.get(i).getTitle();
    }



}
