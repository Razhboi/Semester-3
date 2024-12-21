/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

/**
 *
 * @author Dell
 */

public class Cerpen extends Book {
    private int pages;

    public Cerpen(String title, String genre, String review, int rating, int pages) {
        super(title, genre, review, rating);
        this.pages = pages;
    }

    @Override
    public String getDetails() {
        return "Cerpen: " + title +
                "\nGenre: " + genre +
                "\nReview: " + review +
                "\nRating: " + rating +
                "\nJumlah Halaman: " + pages;
    }
}
