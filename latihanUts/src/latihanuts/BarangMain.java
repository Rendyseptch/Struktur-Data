/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanuts;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class BarangMain { 
   public static void main( String[]args){ 
        int a;
        int byk;
        
      Scanner sc= new Scanner(System.in);
      
      System.out.println(" Masukkan jumlah data barang yang dimasukan: ");
         a= sc.nextInt();
         
  Barang[] pp = new Barang [a];
   for( int i=0; i<a; i++){
    System.out.println("================================");
    System.out.println("barang  "+(i+1));
    System.out.print("nama barang: ");
    pp[i].namaBarang=sc.next();
    System.out.print("kode barang: ");
    pp[i].kodeBarang= sc.next();
    System.out.print("masukkan suplier: ");
    pp[i].suplier= sc.next();
    System.out.print("Stok Barang : ");
    pp[i].stok= sc.nextInt();
    
    
   
   System.out.print(" ");
   pp[i].printDataBarang();
   System.out.print(" ");
   pp[i].barangKeluar();

   }     
   }
       
} 

