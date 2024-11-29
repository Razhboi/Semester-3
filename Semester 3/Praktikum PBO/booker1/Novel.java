/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

/**
 *
 * @author Dell
 */
public class Novel extends Book {
    private String author;
    private String publisher;

    public Novel(String title, String genre, String review, int rating, String author, String publisher) {
        super(title, genre, review, rating);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String getDetails() {
        return "Novel: " + title +
                "\nGenre: " + genre +
                "\nReview: " + review +
                "\nRating: " + rating +
                "\nPenulis: " + author +
                "\nPenerbit: " + publisher;
    }
}