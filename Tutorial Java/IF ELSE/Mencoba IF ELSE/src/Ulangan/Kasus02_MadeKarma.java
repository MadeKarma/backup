/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ulangan;

/**
 *
 * @author Made Karma
 */

import java.util.Scanner;
public class Kasus02_MadeKarma {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka, sisi, panjang, lebar, tinggi, jari2, pAlas, tAlas;
        double hasil, phi;
        phi = 3.14;
        
        System.out.println("========================================");
        System.out.println("Pilih menu untuk hitung bangun ruang");
        System.out.println("========================================");
        System.out.println("1. Volume kubus");
        System.out.println("2. Volume balok");
        System.out.println("3. Volume lingkaran");
        System.out.println("4. Volume Prisma");
        System.out.println("5. Keluar");
        System.out.println("Hitung rumus dengan input angka [ 1 | 2 | 3 | 4 | 5 ]: ");
        angka = input.nextInt();
        System.out.println("========================================");
        
        switch(angka){
            case 1:
                System.out.print("Volume kubus");
                System.out.println("Masukan sisi: ");
                sisi = input.nextInt();
                hasil = sisi * sisi * sisi;
                System.out.println("Hasil dari "+ sisi +" x "+ sisi +" x "+ sisi +" = "+hasil);
            break;
            case 2:
                System.out.println("Volume balok");
                System.out.println("Masukan panjang: ");
                panjang = input.nextInt();
                System.out.println("Masukan lebar: ");
                lebar = input.nextInt();
                System.out.println("Masukan tinggi: ");
                tinggi = input.nextInt();
                hasil = panjang * lebar * tinggi;
                System.out.println("Hasil dari "+ panjang +" x "+ lebar +" x "+ tinggi +" = "+hasil);
            break;
            case 3:
                System.out.println("Volume lingkaran");
                System.out.println("Masukan jari-jari: ");
                jari2 = input.nextInt();
                hasil = phi * jari2 * jari2;
                System.out.println("Hasil dari "+ phi +" x "+ jari2 +" x "+ jari2 +" = "+hasil);
            break;
            case 4:
                System.out.println("Volume prisma");
                System.out.println("Masukan panjang alas: ");
                pAlas = input.nextInt();
                System.out.println("Masukan tinggi alas: ");
                tAlas = input.nextInt();
                System.out.println("Masukan tinggi prisma: ");
                tinggi = input.nextInt();
                hasil = (pAlas * tAlas / 2) * tinggi;
                System.out.println("Hasil dari "+ pAlas +" x "+ tAlas +" / 2 x "+ tinggi +" = "+hasil);
            break;
            case 5:
                System.out.println("Keluar");
            break;
            default:
                System.out.println("Angka yang anda masukan salah ");
        }
    }
}
