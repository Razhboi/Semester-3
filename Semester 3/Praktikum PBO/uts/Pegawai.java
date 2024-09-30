/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai,double gaji){
    this.namaPegawai = namaPegawai;
    this.gaji=gaji;
    }
    
    public void tampilkanInfo(){
    System.out.println("Nama Pegawai :" + getNamaPegawai());
    System.out.println("Gaji : Rp " + getGaji());
    }
    
    public String getNamaPegawai(){
    return namaPegawai;
    }
    
    public double getGaji(){
    return gaji;
    }
}
