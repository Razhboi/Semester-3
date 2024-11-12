/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11;

/**
 *
 * @author Dell
 */
public class MainPerpus {  
    public static void main(String[] args) {  
        Perpustakaan perpustakaan = new Perpustakaan();  
        
        Buku buku1 = new Buku("Algoritma Pemrograman");  
        Buku buku2 = new Buku("Basis Data");  
        
        perpustakaan.tambahBuku(buku1);  
        perpustakaan.tambahBuku(buku2);  
        
        perpustakaan.infoPerpustakaan();  
    }  
}
