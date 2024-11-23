/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_12;

/**
 *
 * @author Dell
 */
import java.io.Serializable;

public class Buku implements Serializable {
    private static final long serialVersionUID = 1L; // Untuk serialisasi
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Konstruktor
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit;
    }
}

