package com.mycompany.praktikum_pbo_4;  

public class Manusia {  
    private String nama;  
    protected int usia;   
    public String pekerjaan;   
    
    public Manusia(String nama, int usia, String pekerjaan) {  
        this.nama = nama;  
        this.usia = usia;  
        this.pekerjaan = pekerjaan; 
    }  
    
    public String getNama() {  
        return nama;  
    }  

    public void setNama(String nama) {  
        this.nama = nama;  
    }  

    public void tampilInfo() {  
        System.out.println("Nama: " + getNama());  
        System.out.println("Usia: " + usia);  
        System.out.println("Pekerjaan: " + pekerjaan);  
    }  
}