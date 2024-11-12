/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11.newpackage;

/**
 *
 * @author Dell
 */
public class MainPerpus {  
    public static void main(String[] args) {  
        // Membuat pengarang  
        Pengarang pengarang1 = new Pengarang("Andrea Hirata");  
        Pengarang pengarang2 = new Pengarang("Arif Hidayat");  

        // Membuat buku  
        Buku buku1 = new Buku("Laskar Pelangi", pengarang1);  
        Buku buku2 = new Buku("Air Mata Manggar", pengarang2);  

        // Membuat perpustakaan dan menambahkan buku  
        Perpustakaan perpustakaan = new Perpustakaan(5);  
        perpustakaan.tambahBuku(buku1);  
        perpustakaan.tambahBuku(buku2);  
       

        // Menampilkan informasi semua buku di perpustakaan  
        perpustakaan.infoPerpustakaan();  
    }  
} 
