/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class nasabahMain {
    public static void main (String []args){
        Scanner input= new  Scanner(System.in);
        String transaksi;
        String n[] = {"adi", "maya", "Anggia", "gita" ,"andi","mito", "galih", "ronio", "Bastian" ,"rendy" };
        int no [] = {00354640,23384949, 90884930,89979934,74844930,45678942,34532453,45532242,94245324,345256655};
        int nk [] = {14884933, 50098333, 15009900, 20009982,88999002,88990087,666567845,99890775,8889908,88877658};
        int sal[]= {300000,450000,500000,660000,780000,450000,340000,2300000,890000,650000};
        
        nasabah urt = new nasabah(n, no,nk,sal, n.length);
        System.out.println("===================================");
        System.out.println("          Data Sebelum Urut        ");
        System.out.println("===================================");
        urt.tampilData();
        System.out.println(" ");
        System.out.println("===================================");
        System.out.println("Data Sesudah Urut ");
        System.out.println("===================================");
        urt.tampilData();
        urt.mengurutkanIns();
        
        
        System.out.println("===================================");
        System.out.println("          PILIH MENU               ");
        System.out.println("===================================");
        System.out.println("1.Pencarian rekening  ");
        System.out.println("2.Tambah              ");
        System.out.println("3.kurang              ");
        System.out.println("masukkan nilai ");
        
       do{
        int nilai = input.nextInt();
//        
        if (nilai==1) {
             urt.mencariData();
//            
        }else if (nilai==2) {
           
            urt.menambah();
        
        } else if (nilai==3){
            urt.mengurangi();
        }
        System.out.println("apakah akan mengulangi menu Transaksi:(ya/tidak) "); 
        
        transaksi= input.next();
       }while(transaksi.equalsIgnoreCase("ya"));
         
      
            
    }
}
     
        
        
        
                
                

        
    
