/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_5;

/**
 *
 * @author Dell
 */
public class Kendaraan {  
    protected String nama;  
    protected int kecepatan;  

    public Kendaraan(String nama, int kecepatan) {  
        this.nama = nama;  
        this.kecepatan = kecepatan;  
    }  

    public String tampilkanInfo() {  
        return "Nama Kendaraan: " + nama + ", Kecepatan: " + kecepatan + " km/jam";  
    }  
}
