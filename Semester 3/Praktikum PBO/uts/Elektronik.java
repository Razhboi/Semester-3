/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk,double harga,int garansi){
    super(namaProduk,harga);
    this.garansi=garansi;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi: "+ getGaransi()+"tahun");
    }
    
    public int getGaransi(){
    return garansi;
    }
    
    public void setGaransi(int garansi){
    this.garansi=garansi;
    }
    
}
