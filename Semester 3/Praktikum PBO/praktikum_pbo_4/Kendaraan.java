/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_4;

/**
 *
 * @author Dell
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    private String jenisMesin;
   
    
    public Kendaraan (String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks= kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    public String getNama (){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama Kendaraan :" + nama);
        System.out.println("Kecepatan Maksimum :" + kecepatanMaks + "km/h");
        System.out.println("Jenis Mesin :" + jenisMesin);
    }
    
}