/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_09;

/**
 *
 * @author Dell
 */
public class MainHewan {
    public static void main(String[]args){
        Hewan Kucing = new Kucing();
        Hewan Anjing = new Anjing();
        Kucing.bersuara();
        Kucing.info();
        Anjing.bersuara();
        Anjing.info();
    
    }
    
}