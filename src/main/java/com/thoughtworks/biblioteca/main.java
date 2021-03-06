package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        PrintStream printStream = System.out;
        Book book = new Book(printStream, "Romeo and Juliet", "Shakespeare", 1600);
        books.add(book);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Library library = new Library(books, printStream, bufferedReader);
        library.start();
        book.printAuthor();
        book.printYearPublished();
//        library.printListOfBooks();

    }

}
