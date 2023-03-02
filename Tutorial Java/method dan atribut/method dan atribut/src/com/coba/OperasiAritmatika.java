/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coba;

/**
 *
 * @author MadeKarma
 */
public class OperasiAritmatika {
    //overloading method
    //perkalian
    public int OPERASI(int A, int B, int C) {
    return (A*B*C);
}
    //penjumlahan
    public int OPERASI(int A,int B,int C,int D,int E) {
    return (A+B+C+D+E);
}
    //pembagian

    public int OPERASI(int A, int B) {
    return (A/B);
}
}
// pembuatan object
class HITUNG{
public static void main(String[] args) {
OperasiAritmatika MTK = new OperasiAritmatika();
    System.out.println("OPERASI MTK OVERLOAD METHOD"+"\n");
    System.out.println("Operasi Perkalian   = " +MTK.OPERASI(3, 4, 5));
    System.out.println("Operasi Penjumlahan = " +MTK.OPERASI(2, 4, 6, 7, 9));
    System.out.println("Operasi Pembagian   = " +MTK.OPERASI(6, 2));

    }
}
