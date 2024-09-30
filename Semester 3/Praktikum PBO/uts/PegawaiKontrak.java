/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak (String nama,double gaji,int lamaKontrak){
    super(nama,gaji);
    this.lamaKontrak = lamaKontrak;
    }
    
    @Override 
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Lama Kontrak:" + lamaKontrak + "bulan");
    }
    
    
    public int getLamaKontrak(){
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    
}
