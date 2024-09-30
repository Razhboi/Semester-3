/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class Makanan extends Produk {  
    private String kadaluarsa;

    // Konstruktor  
    public Makanan(String namaProduk, double harga, String kadaluarsa) {  
        super(namaProduk, harga); 
        this.kadaluarsa = kadaluarsa;  
    }  

   
    @Override  
    public void tampilkanInfo() {  
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + getKadaluarsa());  
    }  

     
    public String getKadaluarsa() {  
        return kadaluarsa; 
    }  

 
    public void setKadaluarsa(String kadaluarsa) {  
        this.kadaluarsa = kadaluarsa;   
    }  
}