/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum_pbo_11.newpackage;

/**
 *
 * @author Dell
 */
class Perpustakaan {  
    private Buku[] bukuList;  
    private int count;  

    public Perpustakaan(int capacity) {  
        this.bukuList = new Buku[capacity]; // Menggunakan array untuk daftar buku  
        this.count = 0;  
    }  

    public void tambahBuku(Buku buku) {  
        if (count < bukuList.length) {  
            bukuList[count] = buku; // Menambahkan buku ke array  
            count++;  
        } else {  
            System.out.println("Perpustakaan sudah penuh! Tidak bisa menambah buku.");  
        }  
    }  

    public void infoPerpustakaan() {  
        if (count == 0) {  
            System.out.println("Perpustakaan kosong!");  
            return;  
        }  
        for (int i = 0; i < count; i++) {  
            bukuList[i].infoBuku(); // Menampilkan informasi setiap buku  
            System.out.println(); // Baris kosong antara buku  
        }  
    }  
}