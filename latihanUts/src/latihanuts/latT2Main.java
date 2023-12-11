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
public class latT2Main {
    public static void main( String []args){
    
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data siswa ");
        int jumlah = sc.nextInt() ;
        System.out.println("----------------------------- ");
        String[] Nm= new String [jumlah];
        int nA[]= new int [jumlah ];
        int nB[]= new int [jumlah ];
        int nC[]= new int [jumlah ];
        int tt[]= new int [jumlah ];
        
        for (int i= 0; i< jumlah; i++){
            System.out.println(" data siswa ke-: " +(i+1)+":");
            System.out.println(" ");
            System.out.println(" nama: ");
            Nm[i]= sc.next();
            System.out.println(" Nilai A: ");
            nA[i]= sc.nextInt();
            System.out.println(" Nilai b: ");
            nB[i]= sc.nextInt();
            System.out.println(" Nilai C: ");
            nC[i]= sc.nextInt();
                tot[i]= nA[i]+nB[i]+nC[];
            
            System.out.println(" : ");
            
        }
}
}
