/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class PaskibrakaMain {
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        DaftarAnggotaPaskibraka data = new DaftarAnggotaPaskibraka();
        int jumPendaftar = 10;
        
        for(int i=0; i<jumPendaftar; i++){
            System.out.print("Nama         : ");
            String nama = s1.next();
            System.out.print("Kelas        : ");
            String kelas = s.next();
            System.out.print("Tinggi Badan : ");
            int tinggi = s.nextInt();
            System.out.println("");
            
            Paskibraka m = new Paskibraka(nama, kelas, tinggi);
            data.tambah(m);
   
        }    
            System.out.println("=================================");
            System.out.println("Data Paskibraka sebelum sorting ");
            data.tampil();
            System.out.println("Data Paskibraka setelah sorting ");
            data.sorting();
            data.tampil();
            
            //modifikasi pada no 2
            System.out.println("Data Peserta Paskibraka Yang LOLOS");
            data.lolos();
          
    }
}

