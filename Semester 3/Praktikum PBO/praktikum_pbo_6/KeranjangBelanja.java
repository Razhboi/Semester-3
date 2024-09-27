/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;  

public class KeranjangBelanja {  
    private Produk[] produkList;  
    private int count;  

    public KeranjangBelanja(int kapasitas) {  
        produkList = new Produk[kapasitas];  
        count = 0;  
    }  

    public void tambahProduk(Produk produk) {  
        if (count < produkList.length) {  
            produkList[count] = produk;  
            count++;  
        } else {  
            System.out.println("Keranjang sudah penuh!");  
        }  
    }  

    public double hitungTotalHarga() {  
        double total = 0;  
        for (int i = 0; i < count; i++) {  
            total += produkList[i].getHarga();  
        }  
        return total;  
    }  
    
    public double hitungTotalHargaSetelahDiskon(int persenDiskon) {  
        double totalHarga = hitungTotalHarga();  
        double diskon = totalHarga * (persenDiskon / 100.0); // Menghitung diskon   
        return totalHarga - diskon; // Mengembalikan total harga setelah diskon  
    }   

    public void tampilkanProduk() {  
        for (int i = 0; i < count; i++) {  
            produkList[i].tampilkanInfo();  
            System.out.println("====================");  
        }  
    }  
}

