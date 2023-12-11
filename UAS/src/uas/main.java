/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class main {
      public static void main(String[] args) {
          
        Kendaraan knd;
        int TNBK;
        boolean data;
        
        SLL sll = new SLL();
        knd = new Kendaraan(22244, "vario  ", 2, 150, "2001", 3);
        sll.addFirst(knd);
        knd = new Kendaraan(23432, "Beat  ", 2, 110, "2015", 3);
        sll.addLast(knd);
        knd = new Kendaraan(21345, "CB ", 2, 250, "20013", 3);
        
        sll.addLast(knd);
        sll.print();
        
        
         Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=====================================================");
            System.out.println("          SISTEM PEMBAYARAN PAJAK KENDARAAN          ");
            System.out.println("=====================================================");
            System.out.println("1. Data Masuk  ");
            System.out.println("2. Cetak ");
            System.out.println("3. Keluar ");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            
            if (pilihan == 1) {
                System.out.println("================================================");
                System.out.println("                    BAYAR PAJAK                 ");
                System.out.println("================================================");
                do {
                    System.out.print(" Silahkaan Masukkan TNBK : ");
                    TNBK = input.nextInt();
                    data = sll.find(TNBK);
                } while (!data);
            } else if (pilihan == 2) {
                sll.print_pt2();
                System.out.println("Total Pendapatan " + sll.totalakhir);
            }
        } while (pilihan >= 1 && pilihan <= 2);
    }

}
