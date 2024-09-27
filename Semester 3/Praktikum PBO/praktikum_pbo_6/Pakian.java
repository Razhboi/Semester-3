/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class Pakian extends Produk{
    private String ukuran; 
    private String jenis;
    
    
    public Pakian(String nama,double harga,String ukuran,String jenis){
        super(nama,harga);
        this.ukuran = ukuran;
        this.jenis = jenis;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Ukuran:"+ukuran);
        System.out.println("Jenis:"+ jenis);
    }
    
    

}
