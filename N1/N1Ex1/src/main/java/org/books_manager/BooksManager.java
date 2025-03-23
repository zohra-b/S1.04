package org.books_manager;

import java.util.*;


public class BooksManager {
    List<Book> books;

    public BooksManager(){
        this.books = new ArrayList<>();
    }

    public Comparator<Book> SORT_BY_AUTHOR = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };

    public void setSORT_BY_AUTHOR(){
        Collections.sort(this.books, SORT_BY_AUTHOR);
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public void addBook(String author, String title){
            if (books.contains(new Book(author, title))){
                System.out.print("This book already exists");
            } else{
                books.add(new Book(author, title));
                setSORT_BY_AUTHOR();
            }
        }

    public void addBooks(List<Book> newListOfBooks) {
        for (Book newBook : newListOfBooks) {
            if (!books.contains(newBook))
                books.add(newBook);
        }
        setSORT_BY_AUTHOR();

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
