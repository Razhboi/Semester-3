/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class Main {  
    public static void main(String[] args) {  
        Produk produk1 = new Elektronik("Android TV", 5000000, 1); 
        Produk produk2 = new Makanan("Mie Instan", 30000, "2025-01-01"); 
        Pegawai pegawai1 = new PegawaiTetap("Noufal", 3000000, 500000);  
        Pegawai pegawai2 = new PegawaiKontrak("Aji", 1500000, 6);  
        
        System.out.println("1.Output Produk :");  
        System.out.println("Informasi Produk:");  
        produk1.tampilkanInfo(); 
        System.out.println();  
        produk2.tampilkanInfo();  
        System.out.println();  
        
       
        System.out.println("3. Informasi Pegawai:");  
        System.out.println("Output pegawai tetap:");
        pegawai1.tampilkanInfo();  
        System.out.println();  
        System.out.println("Output pegawai kontrak:");
        pegawai2.tampilkanInfo(); 
    }  
} 
