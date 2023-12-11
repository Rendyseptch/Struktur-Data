/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ACER
 */


import java.util.Scanner;
public class BangunMain {
    
    public int panjang, lebar, tinggi, jariJari;
   
        public static void main (String[]args){
      
Scanner sc= new Scanner (System.in);
System.out.print("Masukkan jumlah bangun ruang Balok : ");
        int a = sc.nextInt();
        System.out.print("Masukkan jumlah bangun ruang Tabung : ");
        int b = sc.nextInt();
        System.out.print("Masukkan jumlah bangun ruang Bola : ");
        int c = sc.nextInt();
        
         Balok[] blk = new Balok[a];
         Kubus[] tbg = new Kubus[b];
         bola[] bl = new bola[c];
         
         System.out.println();
         System.out.println("=====================================");
         System.out.println("Pogram Menghitung Bangun Ruang Balok");
         System.out.println("=====================================");
         
         for (int i = 0; i < a; i++) {
            blk[i] = new  Balok();
                System.out.print("Masukkan Panjang "+(i+1)+" : ");
                blk[i].panjang  =sc.nextInt();
                System.out.print("Masukkan Lebar "+(i+1)+" : ");
                blk[i].lebar  =sc.nextInt();
                System.out.print("Masukkan Tinggi "+(i+1)+" : ");
                blk[i].tinggi  =sc.nextInt();
                System.out.println("Volume Balok Ke "+(i+1)+" : "+blk[i].hitungVolume());
                System.out.println("Luas permukaan Balok Ke : "+(i+1)+" : "+blk[i]. hitungLuasPermukaan());
                System.out.println(" ");
               
        }
      
        
         System.out.println();
         System.out.println("=====================================");
         System.out.println("    Menghitung Bangun Ruang kubus    ");
         System.out.println("=====================================");
         for (int i = 0; i < b; i++) {
            tbg[i] = new Kubus();
                System.out.print("Masukkan sisi Kubus Ke-"+(i+1)+" : ");
                tbg[i].sisi = sc.nextInt();
                System.out.println("Volume Kubus ke-"+(i+1)+" = "+tbg[i].hitungVolumeKubus());
                System.out.println("Luas Permukaan Kubus ke-"+(i+1)+" = "+tbg[i].hitungLuasPermukaanKubus());
                System.out.println();
        }
       
         System.out.println();
         System.out.println("=====================================");
         System.out.println("    Menghitung Bangun Ruang Bola     ");
         System.out.println("=====================================");
         for (int i = 0; i < c; i++) {
            bl[i] = new bola();
            System.out.print("Masukkan jari-jari BolA Ke- "+(i+1)+" : ");
            bl[i].jariJari = sc.nextInt();
            System.out.println("Volume Bola ke-"+(i+1)+" = "+bl[i].hitungVolume());
            System.out.println("Luas Permukaan Bola ke-"+(i+1)+" = "+bl[i].hitungLuasPermukaan());
            System.out.println();
        }
    }
}
