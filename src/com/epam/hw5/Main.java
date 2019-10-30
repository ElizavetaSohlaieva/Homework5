package com.epam.hw5;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Books library = new Books();
        library.addBooks(new Book(1, "Alice in Wonderland", "Carroll", "Wordsworth", 2018, 160, 202.3));
        library.addBooks(new Book(2, "The Lord of the Rings", "Tolkien", "Hasper", 2014, 1358, 1950.5));
        library.addBooks(new Book(3, "Tom Sawyer", "Mark Twain", "Belford", 1976, 342, 125.5));
        library.addBooks(new Book(4, "The Hobbit", "Tolkien", "Hasper", 1937, 390, 320));
        library.addBooks(new Book(5, "Harry Potter", "J. Rolling", "Bloomsbury", 2014, 332, 415.8));
        library.addBooks(new Book(6, "The Great Gatsby", "F. Scott Fitzgerald", "Wordsworth", 1992, 144, 78.2));
        library.addBooks(new Book(7, "The War Prayer", "Mark Twain", "Wordsworth", 1961, 149, 79.8));
        library.addBooks(new Book(8, "Through the Looking-Glass", "Carroll", "Fingerprint", 2019, 156, 148.2));
        library.addBooks(new Book(9, "The Peoples of Middle-earth", "Tolkien", "Hasper", 2010, 512, 345.2));

        library.viewAllBooks();

        Scanner sc = new Scanner(System.in);
        double proc1;
        proc1 = sc.nextDouble();
        library.changePrice(proc1);
        library.viewAllBooks();

        System.out.println("Search author: ");
        Scanner sc1 = new Scanner(System.in);
        String searchTxt;
        searchTxt = sc1.nextLine();
        Books libraryAutor = new Books();
        libraryAutor.bookArray = library.searchAuthor(searchTxt);
        libraryAutor.viewAllBooks();

        System.out.println("Search year: ");
        Scanner sc2 = new Scanner(System.in);
        int searchYears;
        searchYears = sc2.nextInt();
        Books libraryYears = new Books();
        libraryYears.bookArray = library.searchYear(searchYears);
        libraryYears.viewAllBooks();

    }
}
