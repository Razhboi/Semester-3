/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_5;

/**
 *
 * @author Dell
 */
class Motor extends Kendaraan {  
    String jenisMesin;  

    public Motor(String nama, int kecepatan, String jenisMesin) {  
        super(nama, kecepatan);  
        this.jenisMesin = jenisMesin;  
    }  

    @Override  
    public String tampilkanInfo() {  
        return "Nama Kendaraan: " + nama + "\nKecepatan: " + kecepatan + " km/jam\nJenis Mesin: " + jenisMesin;  
    }  
}
