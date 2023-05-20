package org.example.DZ3.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
// в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
public class Main {
    public static void main(String[] args) {
        List<Book> bookList = getBooks();
        Integer maxSimpleNumber = bookList.stream().max(Comparator.comparingInt(Book::getNumberPages)).get().numberPages;
        List<Integer> simpleNumbers = getSimpleNumbers(maxSimpleNumber);
        bookList = bookList.stream().filter(book -> book.author.contains("A") && book.yearPublication>=2010 &&
                        simpleNumbers.contains(book.numberPages)).toList();
        System.out.println(bookList);
    }

    static List<Book> getBooks() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("book 1", "Author 1", 100.0, 2010, 109));//+
        bookList.add(new Book("book 2", "Author 1", 100.0, 2015, 150));
        bookList.add(new Book("book 3", "Euthor 2", 200.0, 2012, 211));
        bookList.add(new Book("book 4", "Euthor 2", 200.0, 2016, 250));
        bookList.add(new Book("book 5", "Outhor 3", 300.0, 2008, 311));
        bookList.add(new Book("book 6", "Outhor 3", 300.0, 2009, 350));
        bookList.add(new Book("book 7", "OuthAry 4", 300.0, 2010, 313));//+
        bookList.add(new Book("book 8", "Outhary 4", 300.0, 2011, 311));
        return bookList;
    }

    static List<Integer> getSimpleNumbers(int n) {
        ArrayList<Integer> simpleNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i%j==0) count++;
            }
            if (count == 1) {
                simpleNumbers.add(i);
            }
        }
        return simpleNumbers;
    }
}
