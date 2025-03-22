package org.books_manager;

import java.util.Objects;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int hashCode(){
        return Objects.hash(author, title);

    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Book other = (Book) obj;
        return this.title.equalsIgnoreCase(other.title) && this.author.equalsIgnoreCase(other.author);
    }

    public String toString(){
        return this.author + " " + this.title;
    }

}
