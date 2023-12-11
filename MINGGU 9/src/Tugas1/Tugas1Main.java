/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;


/**
 *
 * @author rendy
 */
public class Tugas1Main {
   public static void main( String[]args){
        
        
        Scanner sc= new Scanner(System.in);
        StackTugas1 stk = new StackTugas1(5);
        char pilih;
        String memilih, memilih1;
       do{
            System.out.print("jenis:");
            String jenis= sc.nextLine();
            System.out.print("warna:");
            String warna= sc.nextLine();
            System.out.print("Merk:");
            String merk= sc.nextLine();
            System.out.print("Ukuran:");
            String ukuran= sc.nextLine();
            System.out.print("harga:");
            Double harga= sc.nextDouble();
            
            Tugas1Pakaian p= new Tugas1Pakaian ( jenis,  warna,  merk,ukuran,harga);
            System.out.print("Apakah anda akan menambah data baru ke Stack (y/n)");
            pilih= sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);   
        }while(pilih=='y');
//                stk.print();
//                stk.pop();
//                stk.peek();
//                stk.print();;
       do{
        System.out.println("===================================");
        System.out.println("          PILIH MENU               ");
        System.out.println("===================================");
        System.out.println("1.POP   (Mengambil)            ");
        System.out.println("2.PEEK  (akses)          ");
        System.out.println("3.PRINT (tampil)         ");
        System.out.println("4.Harga Terendah          ");
        System.out.println("masukkan nilai ");
        
        
         
        int nilai = sc.nextInt();
          
         if (nilai==1) {
            stk.pop();
            
        } else if (nilai==2){
           stk.print();
           stk.peek();
           
        }else if (nilai==3){
            stk.print();
        }else if (nilai==4){
            stk.print();
            stk.getMin();
        }
        System.out.println("apakah akan mengulangi menu Transaksi:(ya/tidak) "); 
        
        memilih= sc.next();
        
       }while(memilih.equalsIgnoreCase("ya"));
       
       
       
       
    } 
}
