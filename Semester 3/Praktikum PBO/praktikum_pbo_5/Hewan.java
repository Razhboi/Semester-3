package com.mycompany.praktikum_pbo_5;  

public class Hewan {  
    protected String nama;  
    protected String spesies;  

    public Hewan(String nama, String spesies) {  
        this.nama = nama;  
        this.spesies = spesies;  
    }  

    public String tampilkanInfo() {  
        return "Nama: " + nama + ", Spesies: " + spesies;  
    }  

    public String suara() {  
        return "Suara hewan umum"; // Suara umum  
    }  
}  