package com.mycompany.praktikum_pbo_5;  

public class MainHewan {  
    public static void main(String[] args) {  
        Kucing kucing = new Kucing("Opal", "Persia", 4, "Halus");  
        Anjing anjing = new Anjing("Muso", "Buldog", 4, "Pendek");  

        System.out.println(kucing.tampilkanInfo());  
        System.out.println();  
        System.out.println(anjing.tampilkanInfo());  
    }  
}