/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coba;

/**
 *
 * @author user
 */
    
public class Main {
    String s = "atribut class";
    public static void main(String[] args){
        String k = "atribut method";
        System.out.println(k);
        Main contoh = new Main();
        contoh.setNama();
        System.out.println(contoh.getNama());
        System.out.println(contoh.s);
    }
    
    public void setNama(){
        System.out.println("method void");
    }
    
    public String getNama(){
        return "method nilai balik";
    }
}
