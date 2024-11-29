/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

/**
 *
 * @author Dell
 */
public abstract class Book {
    protected String title;
    protected String genre;
    protected String review;
    protected int rating;

    public Book(String title, String genre, String review, int rating) {
        this.title = title;
        this.genre = genre;
        this.review = review;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getDetails();
}

