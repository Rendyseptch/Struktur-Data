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
public class TanahMain {
    
    public int panjang, lebar, a;
    
    public static void main (String[]args){ 
    Scanner sc= new Scanner(System.in);
  
    System.out.println("Jumlah tanah: ");
    int a= sc.nextInt();
     
     Tanah[]ltArray= new Tanah[a];
     for( int i=0; i<a; i++)
{
    ltArray[i]= new Tanah();
    System.out.println("================================");
    System.out.println("Tanah "+(i+1));
    System.out.print("Panjang: ");
    ltArray[i].panjang=sc.nextInt();
    System.out.print("Lebar: ");
    ltArray[i].lebar=sc.nextInt();
    
}
     int max=0;
     int x=0;
      for(int i=0; i<a; i++)
    {
    System.out.println("Luas Tanah ke-"+(1+1)+ " :"+ ltArray[i].hitungLuas());
    if (ltArray[i].hitungLuas()>max){
        max= ltArray[i].hitungLuas();
        x=i+1;
        }
       }
       System.out.println("================================");
       System.out.println("Tanah Terluas yaitu tanah ke-"+x);
       System.out.println("Dengan Luas Tanah: "+max);
       
    }
}
