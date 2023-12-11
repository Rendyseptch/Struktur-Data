/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanuts;

/**
 *
 * @author rendy
 */
public class Barang {

   public String namaBarang; 
   public String kodeBarang;
   public String suplier;
   public int stok;
   public int Barang[];
   int b;
   
   public Barang(String nb, String kb, String sp, int st ){
       nb= namaBarang ;
       kb= kodeBarang;
       sp= suplier;
       st= stok;
       
   }

   void printDataBarang(){
    System.out.print("nama barang: "+ namaBarang );
    System.out.print("kode barang: "+kodeBarang);
    System.out.print("masukkan suplier: "+ suplier);
    System.out.print("Stok Barang : " +stok);
   }
   int barangKeluar(){
    return  stok-1;
            }
}

