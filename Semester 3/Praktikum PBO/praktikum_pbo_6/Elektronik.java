/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class Elektronik extends Produk{
    private String merek;
    private int garansi;
    
    public Elektronik(String nama,double harga,String merek,int garansi){
        super (nama,harga);
        this.merek = merek;
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Merek:"+ merek);
        System.out.println("Garansi"+ garansi);
    }
    
}
