/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7.tugas;



/**
 *
 * @author rendy
 */
public class tugas1Main {
    public static void main (String []args){
        
    String b[]={"pensil","buku","penggaris","pulpen"};
    int a[]={35, 20, 50, 25};
    int c[]={1000, 5000, 1500, 2000};
    
    tugas1 Urut= new tugas1 (b,a,c, a.length);
    
    System.out.println("=============================");
    System.out.println(" PENGURUTAN BERDASARKAN STOK ");
    System.out.println("=============================");
      System.out.println(" Data Sebelum Urut");
      Urut.tampilData();
//      Urut.Insertion();
  System.out.println(" Data Setelah  Urut (insertion)");
       Urut.Insertion();
       Urut.tampilData();
     
      System.out.println(" Data Setelah  Urut(shellShort)");
      Urut.shellSort();
      Urut.tampilData();
     
   }
}
