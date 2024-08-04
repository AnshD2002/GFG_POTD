/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

/**
 *
 * @author ansh
 */
/*Write a Java program to create a class called "Book"
with attributes for title, author, and ISBN, and
methods to add and remove books from a collection.*/
public class Book {

    String title;
    String author;
    String ISBN;

    void addbook(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    void removebook(){
        this.title = null;
        this.author =null;
        this.ISBN = null;
    }
    void printbook(){
        System.out.println("title : " +title );
        System.out.println("author : " +author );
        System.out.println("ISBN : " +ISBN );

    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.addbook("hello","hi","hey");
        b1.printbook();
        b1.removebook();
        b1.printbook();
    }
}
