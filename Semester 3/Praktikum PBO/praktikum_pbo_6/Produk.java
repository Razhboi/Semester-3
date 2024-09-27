/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class Produk {
    private String nama;
    private double harga;
    
    public Produk(String nama,double harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public void tampilkanInfo(){
        System.out.println("Nama Produk :" + nama);
        System.out.println("Harga Produk :" + harga);
    
    }
}
    
