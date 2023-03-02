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

public class Kasus01_MadeKarma {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        char nilai;
        
        System.out.print("Masukan Nilai Anda [ A | B | C | D | E ]: ");
        
        nilai = input.next().charAt(0);
        
        switch(nilai){
            case 'A':
                System.out.println("Sangat Baik");
            break;
            case 'B':
                System.out.println("Baik");
            break;
            case 'C':
                System.out.println("Cukup");
            break;
            case 'D':
                System.out.println("kurang Cukup");
            break;
            case 'E':
                System.out.println("Kurang");
            break;
            default:
                System.out.println("Nilai yang anda masukan salah");
        }
    }
}
