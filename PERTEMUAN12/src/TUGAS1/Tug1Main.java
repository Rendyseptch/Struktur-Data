/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS1;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class Tug1Main {
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah data Penerima Vaksin");
        System.out.println("2. Hapus data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. keluar");
        System.out.println("+++++++++++++++++++++++++++++"); 
    }
public static void main(String[]args) throws Exception{
    Scanner input = new Scanner (System.in);
    int menu=0;
    
    DoubleLinkedListsTug1 tug= new DoubleLinkedListsTug1();
    while (menu!=4){

         do{
             menu();
             menu=  input.nextInt();
        if(menu==1){
             System.out.println("=============================");
             System.out.println("Masukkan Data Penerima Vaksin");
             System.out.println("=============================");
             System.out.println("Nomor Antrian");
             int Nomor= input.nextInt();
             System.out.println("Nama Penerima");
             String name= input.next(); 
             tug.Enqueue(Nomor,name);
             tug.print();
             break;
             }
        else if(menu==2){
            tug.Dequeue();
            tug.print();
            break;
        }
         else if(menu==3){
            tug.print();
            break;
        }
        else if(menu==4){
            System.out.println("Keluar");
            break;
        }
         System.out.println(" ");

         }while(menu<4);
    }
    
}
}
