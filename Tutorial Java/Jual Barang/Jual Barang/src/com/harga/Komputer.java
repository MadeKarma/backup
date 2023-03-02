/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.harga;

/**
 *
 * @author Made Karma
 */
public class Komputer{
    public static void main(String[] args){
        Harga komputer = new Harga();
        
        komputer.mb = "ASrock";
        komputer.prosesor = "Intel I7 12700K";
        komputer.vga = "GTX 3060";
        komputer.pwsuply = "TX650";
        komputer.storage = "SDD SATA";
        komputer.ram = "8Gb Nvme ddr 5";
        komputer.casing = "Gray";
        komputer.totalharga = 15000000;
        
        System.out.println("Komponen Komputer");
        System.out.println("MotherBoard : " + komputer.mb);
        System.out.println("Prosesor    : " + komputer.prosesor);
        System.out.println("VGA         : " + komputer.vga);
        System.out.println("Power Suply : " + komputer.pwsuply);
        System.out.println("Storage     : " + komputer.storage);
        System.out.println("Ram         : " + komputer.ram);
        System.out.println("wanra       : " + komputer.casing);
        System.out.println("Total Harga : Rp" + komputer.totalharga);
    }
}
