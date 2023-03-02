/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifelse;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        System.out.println("Masukkan kode kelas anda: ");
        angka = input.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("Kelas 1");
                break;
            case 2:
                System.out.println("Kelas 2");
                break;
            case 3:
                System.out.println("Kelas 3");
                break;
            case 4:
                System.out.println("Kelas 4");
                break;
            default:
                System.out.println("Kode yang anda masukan salah");
        }
    }
}
