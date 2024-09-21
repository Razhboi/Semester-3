package com.mycompany.praktikum_pbo_5;  

public class Kucing extends HewanDarat {  
    private String jenisBulu;  

    public Kucing(String nama, String spesies, int jumlahKaki, String jenisBulu) {  
        super(nama, spesies, jumlahKaki);  
        this.jenisBulu = jenisBulu;  
    }  

    @Override  
    public String tampilkanInfo() {  
        return super.tampilkanInfo() + ", Jenis Bulu: " + jenisBulu + ", Suara: " + suara();  
    }  

    @Override  
    public String suara() {  
        return "Suara: Meow"; // Suara khas kucing  
    }  
}