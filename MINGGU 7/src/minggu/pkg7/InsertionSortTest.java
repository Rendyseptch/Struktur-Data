/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class InsertionSortTest {
  
     
    public static void main (String []args){
//       int a[]= {73, 67,56, 32,52,41,83, 37, 32,10 }; 
       Scanner sc = new Scanner(System.in);
        System.out.println(" masukkan banyak data");
        int b =sc.nextInt();
        int a[]= new int [b];
     for(int i=0; i<a.length; i++){
        System.out.println(" masukkan nilai-"+ (i+1)+" ");
            a[i]= sc.nextInt();
        }
    Insertion Urut= new Insertion(a, a.length);
    
      System.out.println(" Data Sebelum Urut");
      Urut.tampilData();
      Urut.Insertion();
      System.out.println(" Data Setelah  Urut(ASC)");
      Urut.tampilData();
    
   }
}
