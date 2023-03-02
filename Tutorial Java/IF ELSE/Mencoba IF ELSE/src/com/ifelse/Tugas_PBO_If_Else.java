/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifelse;

/**
 *
 * @author MadeKarma
 */import java.util.Scanner;
public class Tugas_PBO_If_Else {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        byte nilai;
        System.out.print("Masukan Nilai Anda : ");
        nilai = input.nextByte();
            if (nilai >= 70) {
                System.out.println("Kompeten");
            } else {
                System.out.println("Tidak Kompeten");
            }
    }
}
