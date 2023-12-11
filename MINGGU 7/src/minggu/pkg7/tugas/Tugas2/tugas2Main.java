/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7.tugas.Tugas2;

/**
 *
 * @author rendy
 */
import  java.util.Scanner;

public class tugas2Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        tugas2_ urut = new tugas2_();
        int jumData = 5;
        for(int i=0; i<jumData; i++){
            System.out.print("Nama Mahasiswa : ");
            String nama = sc1.nextLine();
            System.out.print("Nilai A : ");
            int nilaiA = sc.nextInt();
            System.out.print("Nilai B : ");
            int nilaiB = sc.nextInt();
            System.out.print("Nilai C : ");
            int nilaiC = sc.nextInt();
            int total = (nilaiA+nilaiB+nilaiC);

            tugas2 m = new tugas2(nama, nilaiA, nilaiB, nilaiC, total);
            urut.tambah(m);
        }
        System.out.println(" ");
        urut.Tampil();
    
}
}