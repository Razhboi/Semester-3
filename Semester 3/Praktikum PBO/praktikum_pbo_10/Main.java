/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_10;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args){
        operasihitung penjumlahan = new penjumlahan();
        System.out.println("Penjumlahan:" + penjumlahan.hitung(10,5));
        
        operasihitung pengurangan  = new pengurangan();
        System.out.println("Pengurangan:" + pengurangan.hitung(10,5));
                
    
    }
    
}
