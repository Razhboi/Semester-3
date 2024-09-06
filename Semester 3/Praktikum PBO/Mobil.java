package praktikum3;  

public class Mobil {  
    private String merk;  
    private String model;  
    private String warna;  
    private int tahun;  
    private boolean mesinMobil; // Mengganti nama variabel  menjadi 'mesinMobil'  
    
    public Mobil(String merk, String model, String warna, int tahun) {  
        this.merk = merk;  
        this.model = model;  
        this.warna = warna;  
        this.tahun = tahun;  
        this.mesinMobil = false; // Inisialisasi status mesin  
    }  
    
    public String getMerk() {  
        return merk;  
    }  
    
    public void setMerk(String merk) {  
        this.merk = merk;  
    }  
    
    public String getModel() {  
        return model;  
    }  
    
    public void setModel(String model) {  
        this.model = model;  
    }  
    
    public String getWarna() {  
        return warna;  
    }  
    
    public void setWarna(String warna) {  
        this.warna = warna;  
    }  
    
    public int getTahun() {  
        return tahun;  
    }  
    
    public void setTahun(int tahun) {  
        this.tahun = tahun;  
    }  
    
    void displayinfo() {  
        System.out.println("Merk: " + getMerk() + "\nModel: " + getModel() + "\nWarna: " + getWarna() + "\nTahun: " + getTahun());  
    }  
    
    void startEngine() {  
        if (!mesinMobil) { // Memeriksa apakah mesin belum menyala  
            mesinMobil = true; // Menyalakan mesin  
            System.out.println("Mesin Mobil " + getMerk() + " Menyala");  
        } else {  
            System.out.println("Mesin Mobil " + getMerk() + " Sudah Menyala");  
        }  
    }  
    
    void stopEngine() { // Perbaiki  nama metode menjadi 'stopEngine'  
        if (mesinMobil) { // Memeriksa apakah mesin sedang menyala  
            mesinMobil = false; // Mematikan mesin  
            System.out.println("Mesin Mobil " + getMerk() + " Dimatikan");  
        } else {  
            System.out.println("Mesin Mobil " + getMerk() + " Sudah Dimatikan");  
        }  
    }  
}