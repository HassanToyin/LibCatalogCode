package com.Library.LibraryCatalog.dto;


public class LibraryDto {
    private long id;
    private String title;
    private String author;
    private String isbn;


    public LibraryDto() {

    }


    public LibraryDto(long id, String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return "LibraryDto{" +
                ", title= '" +  title + '\'' +
                ", author='" +  author + '\'' +
                ", isbn = '" + isbn + '\'' +
                '}';
    }
}