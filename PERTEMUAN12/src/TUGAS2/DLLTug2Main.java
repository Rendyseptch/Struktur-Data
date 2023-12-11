/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class DLLTug2Main {
    public static void menu(){
        System.out.println("================================");
        System.out.println("      DATA FILM LAYAR LEBAR     ");
        System.out.println("================================");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data index tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. cetak");
        System.out.println("8. Cari ID film");
        System.out.println("9. urut data rating film-DESC");
        System.out.println("10. keluar");
        System.out.println("================================");
        
    }
    public static void main(String[]args) throws Exception{
    Scanner input = new Scanner (System.in);
    int menu=0, index=0;
    String judul;
    int id,cari;
    double rate;
    DLLTugas2 tug= new DLLTugas2();
    while (menu!=4){
         do{
             menu();
             menu=  input.nextInt();
        if(menu==1){
            System.out.println("Masukkan Data Film posisi awal");
            System.out.println("ID Film : ");
            id=input.nextInt();
            System.out.println("Judul Film : ");
            judul=input.next();
            System.out.println("Rating Film : ");
            rate=input.nextDouble();
            tug.addFirst(id, judul, rate);
            break;
            }
        if(menu==2){
            System.out.println("Masukkan Data Film posisi awal");
            System.out.println("ID Film : ");
            id=input.nextInt();
            System.out.println("Judul Film : ");
            judul=input.next();
            System.out.println("Rating Film : ");
            rate=input.nextDouble();
            tug.addLast(id, judul, rate);
            break;
        }
        if(menu==3){
            System.out.println("Masukkan Data Film posisi awal");
            System.out.println("ID Film : ");
            id=input.nextInt();
            System.out.println("Judul Film : ");
            judul=input.next();
            System.out.println("Rating Film : ");
            rate=input.nextDouble();
            System.out.println("Data Film ini akan masuk di urutan ke-: ");
            index=input.nextInt();
            tug.add(id, judul, rate, index);
            break;
        }
        if(menu==4){
             System.out.println("Hapus Data Pertama ");
             tug.removeFirst();
             break;
        }
        if(menu==5){
          System.out.println("Hapus Data Terakhir ");
          tug.removeLast();
          break;  
        }
        if(menu==6){
          System.out.println("Hapus Data Tertentu ");
          System.out.println("Posisi data film pada indeks ke");
          index= input.nextInt();
          tug.remove(index);
          break;  
        }
        if(menu==7){
          System.out.println("cetak data ");
          tug.print();
          break; 
        }
        if(menu==8){
          System.out.println("Cari ID film ");
          System.out.println("Masukkan ID:  ");
          cari=input.nextInt();
          tug.Search(cari);
          break;  
        }
        if(menu==9){
          System.out.println("Urut data rating film-DESC ");
          tug.sort();
          tug.print();
          break; 
        }
        if(menu==10){
          System.out.println("Keluar");
          break; 
        }
          System.out.println(" ");     
        }while(menu<10);   
    }
    }
   }

