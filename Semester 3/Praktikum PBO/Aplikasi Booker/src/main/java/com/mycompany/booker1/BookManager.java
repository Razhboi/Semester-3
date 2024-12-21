/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

/**
 *
 * @author Dell
 */
import java.io.*;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
        loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks(); // Setelah menambahkan buku, simpan data
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        saveBooks(); // Setelah menghapus buku, simpan data
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Menyimpan buku ke file
    private void saveBooks() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
            out.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Memuat buku dari file
    private void loadBooks() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"))) {
            books = (ArrayList<Book>) in.readObject();
        } catch (FileNotFoundException e) {
            // File tidak ditemukan, berarti belum ada data
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


