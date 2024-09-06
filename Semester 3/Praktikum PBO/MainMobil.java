/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Dell
 */
public class MainMobil {
       public static void main(String[]args) {
        Mobil satu = new Mobil("Rubicon","Hammer","Hijau Dongker",2024);
        satu.displayinfo();
        satu.startEngine();
        satu.stopEngine();
        System.out.println("");
        
        Mobil dua = new Mobil("Civic","Sedan","Merah",2020);
        dua.displayinfo();
        dua.startEngine();
        dua.stopEngine();
        System.out.println("");
        
        Mobil tiga = new Mobil("Mobilio","Headback","Silver",2012);
        tiga.displayinfo();
        tiga.startEngine();
        tiga.stopEngine();
        
      }
       
}
