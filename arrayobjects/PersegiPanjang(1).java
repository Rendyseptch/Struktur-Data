/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;
/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class PersegiPanjang {

    public int a ;
    
    
    public static void main (String[] args){
       
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Masukkan banyak array  Persegi panjang: ");
        int a= sc.nextInt();
        
        PersegiPjg []ppArray= new PersegiPjg[a];
        for( a=0; a<3; a++)
        {
            ppArray[a]= new PersegiPjg();
            System.out.println("Persegi Panjang ke-"+(a+1));
            System.out.print("Masukkan Panjang: ");
            ppArray[a].panjang=sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[a].lebar=sc.nextInt();
        }
        for(int i=0; i<3; i++)
        {
            System.out.println("Persegi Panjang ke-"+(i+1));
            System.out.println("Panjang : "+ ppArray[i].panjang+ ", lebar: " + ppArray[i].lebar);
        }
    }
}
