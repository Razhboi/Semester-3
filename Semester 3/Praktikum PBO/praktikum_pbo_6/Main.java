/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_6;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args){
        Hewan kucing = new Kucing ();
        kucing.bersuara();
        kucing.makan("Ikan");
        kucing.makan("ikan",2);
        
        Hewan anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Daging");
        anjing.makan("Daging",1);
    }
    
}

