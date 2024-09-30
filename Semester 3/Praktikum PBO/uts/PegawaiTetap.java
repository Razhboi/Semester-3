/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Dell
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap (String nama, double gaji, double tunjangan){
        super(nama,gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.print("Tunjagan:"+ tunjangan);
    }
    
    public double getTunjangan(){
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    
    
}
