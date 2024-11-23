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

public class Produk implements Serializable {
    private static final long serialVersionUID = 1L; // Untuk serialisasi
    private String namaProduk;
    private double harga;
    private int stok;

    // Konstruktor
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok);
    }

    @Override
    public String toString() {
        return "Nama Produk: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
    }
}


