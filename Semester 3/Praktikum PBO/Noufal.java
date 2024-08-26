/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.noufal;

/**
 *
 * @author Dell
 */
public class Noufal {  
    private String npm;  
    private String nama;  
    private String alamat;  

    // Constructor  
    public Noufal(String npm, String nama, String alamat) {  
        this.npm = npm;  
        this.nama = nama;  
        this.alamat = alamat;  
    }  

    // Getter untuk NPM  
    public String getNpm() {  
        return npm;  
    }  

    // Setter untuk NPM  
    public void setNpm(String npm) {  
        this.npm = npm;  
    }  

    // Getter untuk Nama  
    public String getNama() {  
        return nama;  
    }  

    // Setter untuk Nama  
    public void setNama(String nama) {  
        this.nama = nama;  
    }  

    // Getter untuk Alamat  
    public String getAlamat() {  
        return alamat;  
    }  

    // Setter untuk Alamat  
    public void setAlamat(String alamat) {  
        this.alamat = alamat;  
    }  

    // Metode untuk menampilkan informasi  
    public void displayInfo() {  
        System.out.println("NPM: " + npm);  
        System.out.println("Nama: " + nama);  
        System.out.println("Alamat: " + alamat);  
    }  
    
        public static void main(String[] args) {  
        // Membuat objek mahasiswa  
        Noufal mahasiswa1 = new Noufal("123456789", "Budi Santoso", "Jl. Contoh No. 1");  
        
        // Menampilkan informasi mahasiswa  
        mahasiswa1.displayInfo();  

        // Mengubah nama dan alamat  
        mahasiswa1.setNpm("2340506059");
        mahasiswa1.setNama("Noufal Aji Prasetyo");  
        mahasiswa1.setAlamat("Drojogan,Bumirejo,rt05rw06,Mungkid,Magelang");  
        
        // Menampilkan informasi setelah diubah  
        System.out.println("\nSetelah diubah:");  
        mahasiswa1.displayInfo();  
        }
    }


