/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11;

/**
 *
 * @author Dell
 */
public class MainClub {  
    public static void main(String[] args) {  
        Club Club = new Club("Klub Pemrograman");  

        Anggota anggota1 = new Anggota("Alice");  
        Anggota anggota2 = new Anggota("Bob");  

        Club.tambahAnggota(anggota1);  
        Club.tambahAnggota(anggota2);  

        Club.infoClub();  
    }  
}  
