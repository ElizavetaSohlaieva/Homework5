package com.epam.hw5;

import java.util.Arrays;

public class Books {

    public Book[] bookArray = new Book[0];

    public void addBooks(Book newBook){
        bookArray = Arrays.copyOf(bookArray, bookArray.length + 1);
        bookArray[bookArray.length - 1] = newBook;
    }
    public void viewAllBooks(){
        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i].viewBook();
        }
    }
    public void changePrice(double proc){
        double newPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            newPrice = bookArray[i].getPrice() + bookArray[i].getPrice() * proc / 100;
            bookArray[i].setPrice(newPrice);
        }
    }
    public Book[] searchAuthor(String searchText){
        Book[] returnBooks = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getAuthor().equals(searchText)){
                returnBooks = Arrays.copyOf(returnBooks, returnBooks.length + 1);
                returnBooks[returnBooks.length - 1] = bookArray[i];
            }else{
                System.out.println("Nothing is found!");
            }
        }
        return returnBooks;
    }
    public Book[] searchYear(int finderYear){
        Book[] returnYear = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getYear() > finderYear){
                returnYear = Arrays.copyOf(returnYear, returnYear.length + 1);
                returnYear[returnYear.length - 1] = bookArray[i];
            }else{
                System.out.println("Nothing found!");
            }
        }
        return returnYear;
    }
}

