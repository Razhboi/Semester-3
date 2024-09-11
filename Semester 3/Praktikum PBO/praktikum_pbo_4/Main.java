package com.mycompany.praktikum_pbo_4;  

public class Main {  
    public static void main(String[] args) {  
        // Membuat objek dari kelas Pekerja dengan menginisialisasi nama, usia, pekerjaan, dan gaji  
        Pekerja pekerja = new Pekerja("Pras", 21, "Programmer", 10000000.00);  
        
        // Menampilkan informasi pekerja menggunakan metode toString()  
        System.out.println(pekerja.toString());  
        
        // Mengubah nama pekerja menggunakan metode setter  
        pekerja.setNama("Noufal");  
        
        // Menampilkan ulang informasi pekerja setelah mengubah nama  
        System.out.println(pekerja.toString());  
        
        // Mencoba akses langsung atribut (akan menyebabkan kesalahan jika digunakan)  
        // System.out.println(pekerja.nama); // Ini akan menghasilkan kesalahan karena nama bersifat private  
        // System.out.println(pekerja.usia); // Ini akan menghasilkan kesalahan karena usia bersifat protected  
        // System.out.println(pekerja.gaji); // Ini akan menghasilkan kesalahan karena gaji bersifat private  
    }  
}