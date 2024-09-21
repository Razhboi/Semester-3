/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_5;

/**
 *
 * @author Dell
 */
 class Mobil extends Kendaraan {
     int jumlahPintu;
     
     public Mobil (String nama, int kecepatan, int jumlahPitu){
         super(nama,kecepatan);
         this.jumlahPintu = jumlahPintu;
     }
     
     @Override
     public String tampilkanInfo(){
         return "Nama Kendaraan"+ nama+ "\nKecepatan"+ kecepatan + "km/jam\nJumlah Pintu + jumlahPintu";
     }
    
}
