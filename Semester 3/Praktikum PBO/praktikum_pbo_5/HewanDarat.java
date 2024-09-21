package com.mycompany.praktikum_pbo_5;  

public class HewanDarat extends Hewan {  
    protected int jumlahKaki;  

    public HewanDarat(String nama, String spesies, int jumlahKaki) {  
        super(nama, spesies);  
        this.jumlahKaki = jumlahKaki;  
    }  

    @Override  
    public String tampilkanInfo() {  
        return super.tampilkanInfo() + ", Jumlah Kaki: " + jumlahKaki;  
    }  
}  