/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class Buku extends Produk {  
    private String penulis;  
    private int kode;  

    // Konstruktor  
    public Buku(String nama, double harga, String penulis, int kode) {  
        super(nama, harga);
        this.penulis = penulis;  
        this.kode = kode;  
    }  

    @Override  
    public void tampilkanInfo() {  
        super.tampilkanInfo(); // Memanggil method dari kelas induk  
        System.out.println("Penulis: " + penulis);  
        System.out.println("Kode: " + kode);  
    }  
}
    

