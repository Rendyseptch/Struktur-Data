/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN.tugas3;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
        public class BukuMain{
public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int JumHal=0;
        int JumBuku=4;
        String NamaBk=null;
        double UkuranBuku=0;
        
        
        PengurutanBuku urt = new PengurutanBuku();
        System.out.println("===========================");
        System.out.println("    Mengurutkan Buku       ");
        System.out.println("===========================");
        
        for(int i=0; i<JumBuku; i++){    
            System.out.println("Buku ke " +(i+1));
            System.out.print("Judul Buku: ");
            NamaBk=input.next();
            System.out.print("Jumlah Halaman: ");
            JumHal=input.nextInt();
            System.out.print("Ukuran Buku:  ");
            UkuranBuku=input.nextDouble();
            System.out.println();
            Buku bk=new Buku(NamaBk,JumHal,UkuranBuku);
            urt.tambah(bk);
        }
        
       
        System.out.println("Data sebelum sorting");
        urt.tampil();
        System.out.println();
        System.out.println("Jumlah Halaman (Desc)");
        urt.selectionSort();
        urt.tampil();
        System.out.println();
        System.out.println("Ukuran Buku (Asc)");
        urt.bubblesort();
        urt.tampil();
       
    }
 }
