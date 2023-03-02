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
public class pemilihan1 {
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("Masukan Sebuah bilangan: ");
        bil = input.nextInt();
        if (bil%2==0) {
            System.out.println("Bilangan Genap");
        }
            else {
                    System.out.println("Bilangan Ganjil");
                    }
        }
    }

