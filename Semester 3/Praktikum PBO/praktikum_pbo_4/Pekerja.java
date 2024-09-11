package com.mycompany.praktikum_pbo_4;  

public class Pekerja extends Manusia {  
    private double gaji;  // Atribut gaji, bersifat private  

    // Constructor untuk menginisialisasi atribut  
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {  
        super(nama, usia, pekerjaan);  // Memanggil constructor dari kelas induk Manusia  
        this.gaji = gaji;  
    }  

    // Getter untuk gaji  
    public double getGaji() {  
        return gaji;  
    }  
    

    // Override metode toString untuk menampilkan informasi lengkap  
    @Override  
    public String toString() {  
        return "Nama: " + getNama() +  
               ", Usia: " + usia +  
               ", Pekerjaan: " + pekerjaan +  
               ", Gaji: " + gaji;  
    }  
}