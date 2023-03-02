/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_agus_if_else;

/**
 *
 * @author Agusyudi
 */import java.util.Scanner;
public class java {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        byte nilai;
        System.out.println("masukan nilai anda : ");
        nilai = input.nextByte();
            if (nilai >= 70) {
                System.out.println("kompeten");
            } else {
                System.out.println("Tidak Kompeten");
            }
        
        
    }
    
}
