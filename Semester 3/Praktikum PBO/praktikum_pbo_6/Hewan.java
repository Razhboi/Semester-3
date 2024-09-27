/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
class Hewan {
    public void bersuara(){
        System.out.println("Hewan bersuara");
    }
    public void makan(String makanan){
         System.out.println("Hewan makan" + makanan);
    }
    public void makan(String makanan, int jumlah){
        System.out.println("Hewan makan" + jumlah + "Porsi"+ makanan);
    }
}