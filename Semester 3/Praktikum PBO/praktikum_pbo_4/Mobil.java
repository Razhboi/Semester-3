/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_4;

/**
 *
 * @author Dell
 */
public class Mobil extends Kendaraan{
    private int jumlahPintu;
    
    public Mobil (String nama,int kecepatanMaks,String jenisMesin, int jumlahPintu){
        super (nama,kecepatanMaks,jenisMesin);
        this.jumlahPintu = jumlahPintu;
        
    }
    
    public void tampilkaninfoMobil(){
        System.out.println("Kecepatan Maksimum Mobil : " + kecepatanMaks + "km/h");
        System.out.println("Jumlah Pintu : "+ jumlahPintu);
    }
}
