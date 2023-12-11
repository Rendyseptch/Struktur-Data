/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author rendy
 */
public class Kendaraan {
    String nama;
    String tahun;
    int bulan,cc,jenis,TKNB;
    
    Kendaraan(int TKNB,String nama,int jenis,int cc,String tahun,int bulan){
        this.TKNB = TKNB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulan = bulan;
    }
}
