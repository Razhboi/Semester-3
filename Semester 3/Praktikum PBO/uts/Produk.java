/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class Produk { 
    private String namaProduk; 
    private double harga;    

    
    public Produk(String namaProduk, double harga) {  
        this.namaProduk = namaProduk; 
        this.harga = harga;            
    }  

   
    public void tampilkanInfo() {  
        System.out.println("Nama Produk: " + getNamaProduk());  
        System.out.println("Harga: Rp " + getHarga());  
    }  

   
    public String getNamaProduk() {  
        return namaProduk;  
    }  


    public double getHarga() {  
        return harga;  
    }  
}
    
