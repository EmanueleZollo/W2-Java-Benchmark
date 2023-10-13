package Emanuele.entities;

import java.time.LocalDate;

public abstract class publicationElement {
    private long isbn;
    private String title;
    private LocalDate publicationYear;
    private int pagesNum;

    public publicationElement(long isbn, String title, LocalDate publicationYear, int pagesNum) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.pagesNum = pagesNum;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", pagesNum=" + pagesNum +
                '}';
    }
}
