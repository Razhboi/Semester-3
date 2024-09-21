/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_5;

/**
 *
 * @author Dell
 */
public class MainKendaraan {  
    public static void main(String[] args) {  
        Mobil mobil = new Mobil("BMW M4", 250, 2);  
        Motor sepedaMotor = new Motor("Yamaha NMAX", 155, "Mesin 155cc");  

        System.out.println(mobil.tampilkanInfo());  
        System.out.println();   
        System.out.println(sepedaMotor.tampilkanInfo());  
    }  
}
