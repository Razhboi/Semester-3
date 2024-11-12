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
class Club {  
    private String namaClub;  
    private List<Anggota> anggotaList;  

    public Club(String namaKlub) {  
        this.namaClub = namaKlub;  
        this.anggotaList = new ArrayList<>();  
    }  

    public void tambahAnggota(Anggota anggota) {  
        anggotaList.add(anggota);  
    }  

    public void infoClub() {  
        System.out.println("Nama Klub: " + namaClub);  
        for (Anggota anggota : anggotaList) {  
            anggota.infoAnggota();  
        }  
    }  
} 
