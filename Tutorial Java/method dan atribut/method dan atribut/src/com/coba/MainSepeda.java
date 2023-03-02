/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coba;

/**
 *
 * @author user
 */
public class MainSepeda {
    String jenis, warna;
    int ram, thpembuatan;
    
    	public void set(String jenis, String warna, int ram, int thpembuatan){
        	this.jenis = jenis;
       		this.warna = warna;
		this.ram = ram;
		this.thpembuatan = thpembuatan;
    		}
    	public void tampil(){
		System.out.println("Spesifikasi Laptop HP");
        	System.out.println("Jenis			: " + jenis);
       		System.out.println("Warna 			: " + warna);
		System.out.println("Ram			: " + ram +"Gb");
		System.out.println("Tahun Pembuatan         : " +thpembuatan);
    		}
        	public static void main(String[] args) {
           		MainSepeda sp = new MainSepeda ();
            		sp.set("Victus", "Abu-abu gelap", 32, 2022);
            		sp.tampil();
           		 }

}

