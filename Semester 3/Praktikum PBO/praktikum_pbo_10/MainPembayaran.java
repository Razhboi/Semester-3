/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_10;

/**
 *
 * @author Dell
 */
public class MainPembayaran {
    public static void main(String[]args){
    Pembayaran TV  = new Elektronik();
    System.out.println("Harga TV dan PPN nya :" + TV.hitungPajak(250000));
    
    
    Pembayaran Burger  = new Makanan();
    System.out.println("Harga Burger dan PPN nya :" + Burger.hitungPajak(250000));
    }
}
