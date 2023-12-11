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
public class DataMahasiswa {
   
    public  int a;
   public int Mahasiswa=0;
    
    public static void main (String[]args){
        Scanner input= new Scanner (System.in);
         
        System.out.print("jumlah mahasiswa yang akan di data: ");
         int a = input.nextInt();
         
         Mahasiswa []ppArray= new Mahasiswa[a];
        
         for(int  i=0; i<a; i++)
        {
            ppArray[i]= new Mahasiswa();
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan Nama: ");
            ppArray[i].nama=input.next();
            System.out.print("Masukkan NIM: ");
            ppArray[i].nim=input.nextInt();
            System.out.print("Masukkan jenis Eelamin: ");
            ppArray[i].jenisKelamin=input.next();
            System.out.print("Masukkan IPK : ");
            ppArray[i].ipk= input.nextFloat();
            System.out.println(" ");
        }
          for(int i=0; i<a; i++)
        {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("Nama          : "+ ppArray[i].nama);
            System.out.println("NIM           : "+ ppArray[i].nim);
            System.out.println("Jenis Kelamin : "+ ppArray[i].jenisKelamin);
            System.out.println("ipk           : "+ ppArray[i].ipk);
        }
         
        
    }
}
