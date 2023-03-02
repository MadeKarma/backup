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
public class Main {
    public static void main(String[] args){
        coba1();
    }
    public static void coba1(){
        Scanner input = new Scanner(System.in);

    int bayar;

    System.out.print("Masukkan total belanja anda: ");
    bayar = input.nextInt();

    if (bayar >= 2000000) {
      System.out.println("Selamat anda mendapatkan hadiah kompor gas");
    } else if (bayar >= 1000000) {
      System.out.println("Selamat anda mendapatkan hadiah teflon");
    } else if (bayar >= 500000) {
      System.out.println("Selamat anda mendapatkan hadiah piring");
    } else {
      System.out.println("Maaf anda belum beruntung, tingkatkan belanja anda!");
    }
    }
}
