/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11;

/**
 *
 * @author Dell
 */


import java.util.List;  
import java.util.ArrayList;
class Perpustakaan {  
    private List<Buku> bukuList; // Sekarang List dapat ditemukan  

    public Perpustakaan() {  
        this.bukuList = new ArrayList<>(); // Sekarang ArrayList dapat ditemukan  
    }  

    public void tambahBuku(Buku buku) {  
        bukuList.add(buku);  
    }  

    public void infoPerpustakaan() {  
        for (Buku buku : bukuList) {  
            buku.infoBuku();  
        }  
    }  
} 
