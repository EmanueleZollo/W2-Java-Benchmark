package Emanuele.entities;

import java.time.LocalDate;

public class Book extends publicationElement {
    private String author;
    private String genre;

    public Book(long isbn, String title, LocalDate publicationYear, int pagesNum) {
        super(isbn, title, publicationYear, pagesNum);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
