package org.example.DZ3.task3;

public class Book {
    String nameBook;
    String author;
    Double price;
    Integer yearPublication;
    Integer numberPages;

    public Book(String nameBook, String author, Double price, Integer yearPublication, Integer numberPages) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.yearPublication = yearPublication;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return  "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearPublication=" + yearPublication +
                ", numberPages=" + numberPages + "\n";
    }

    public Integer getNumberPages() {
        return numberPages;
    }
}
