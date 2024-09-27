/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class MainProduk{  
    public static void main(String[] args) {  
        // Membuat instansi kelas KeranjangBelanja dengan kapasitas 5  
        KeranjangBelanja keranjang = new KeranjangBelanja(5);  

        // Membuat beberapa produk  
        Produk produk1 = new Produk("Mouse", 500000);  
        Produk produk2 = new Produk("Smartphone", 7000000);
        Produk produk3 = new Produk("Tablet", 3000000);  

        // Menambahkan produk ke dalam keranjang  
        keranjang.tambahProduk(produk1);  
        keranjang.tambahProduk(produk2);  
        keranjang.tambahProduk(produk3);  

        // Menampilkan semua produk dalam keranjang  
        System.out.println("Produk dalam keranjang:");  
        keranjang.tampilkanProduk();  

        // Menghitung total harga sebelum diskon  
        double totalHarga = keranjang.hitungTotalHarga();  
        System.out.println("Total harga sebelum diskon: " + totalHarga);  

        // Hitung total harga setelah diskon 10%  
        double totalHargaSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon(10);  
        System.out.println("Total harga setelah diskon 10%: " + totalHargaSetelahDiskon);  
    }  
}
