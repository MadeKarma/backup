/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ulangan;

/**
 *
 * @author Madekarma
 */import java.util.Scanner;
public class Kasu03_MadeKarma {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        String nama, pangkat;
                
        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();
        System.out.print("Pangkat/ Golongan :");
        pangkat = input.nextLine();
        
        switch (pangkat){
            case "IIA" :
                System.out.println("Gaji pokok Rp 1.800,00.");
            break;
            case "IIB" : 
                System.out.println("Gaji pokok Rp 1.925,00.");
            break;
            case "IIC" : 
                System.out.println("Gaji pokok Rp 2.025,00.");
            break;
            case "IID" : 
                System.out.println("Gaji pokok Rp 2.125,00.");
            break;
            case "IIIA" : 
                System.out.println("Gaji pokok Rp 2.350,00.");
            break;
            case "IIIB" : 
                System.out.println("Gaji pokok Rp 2.670,00.");
            break;
            case "IIIC" : 
                System.out.println("Gaji pokok Rp 2.890,00.");
        
            default : 
                System.out.println("input yang anda masukan salah");
        }
    }
}
