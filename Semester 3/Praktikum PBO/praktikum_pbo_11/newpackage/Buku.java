/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11.newpackage;

/**
 *
 * @author Dell
 */
class Buku {  
    private String judul;  
    private Pengarang pengarang; // Agregasi, Buku memiliki Pengarang  

    public Buku(String judul, Pengarang pengarang) {  
        this.judul = judul;  
        this.pengarang = pengarang;  
    }  

    public void infoBuku() {  
        System.out.println("Judul Buku: " + judul);  
        pengarang.infoPengarang(); // Menampilkan informasi pengarang  
    }  
} 
