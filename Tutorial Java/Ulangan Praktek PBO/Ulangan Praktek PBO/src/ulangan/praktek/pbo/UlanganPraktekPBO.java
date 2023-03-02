/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ulangan.praktek.pbo;

/**
 *
 * @author Made Karma
 */
public class UlanganPraktekPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        PraktekPbo2 kata = new PraktekPbo2();
        kata.senang();
        
        kata.kalimat = "ini merupakan isi dari String";
        kata.angka = 123;
        kata.pecahan = 4.5;
        
        System.out.println(kata.kalimat);
        System.out.println(kata.angka);
        System.out.println(kata.pecahan);
        
        kata.cetakhasil();
    }
    
}
