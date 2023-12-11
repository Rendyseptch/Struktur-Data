/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2;



/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class DLLMain {
     public static void menu(){
        
        System.out.println("Menu");
        System.out.println("1. Tambah antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporam Pengurutan pesanan by nama");
        System.out.println("5. Hitung Total Pendapatan ");
        System.out.println("6. keluar");
        
     }
    public static void main( String[]args){
         Scanner input = new Scanner (System.in);
         String nama,nama1,noHP;
         int nim,no,absen;
     
     System.out.println("======= QUIZ 2 PRAKTIKUM ASD MI-1D=========");
        System.out.println("Dibuat oleh : ");
        nama= input.next();
        System.out.print("NIM   : ");
        nim= input.nextInt();
        System.out.print("Absen : ");
        absen= input.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Sistem Antrian  Resto royal delish");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    
    DoubleLinkedListPembeli tug= new DoubleLinkedListPembeli();
    int angka= input.nextInt();
   int menu=0,  index=0;
    do{
             menu();
             menu=  input.nextInt();
        if(menu==1){
             System.out.println("------------------------------");
             System.out.println("Masukkan data pembeli");
             System.out.println("------------------------------");
             System.out.println("Nomor Antrian");
             no= input.nextInt();
             System.out.println("Nama Customer");
             nama1= input.next();
             System.out.println("NoHp");
             noHP= input.next();
             if(tug.isEmpty()){
             tug.addFirst(no,nama1,noHP);
             }else{
              tug.addLast(no,nama1,noHP);
             }
             }
        else if(menu==2){
            tug.print();
        }
//        
//        }
//        else if(menu==4){
//            System.out.println("Keluar");
//            break;
//        }
//         else if(menu==5){
//            tug.removeFirst();
//            break;
//        }
//         else if(menu==6){
//            tug.removeFirst();
//            break;
//        }
//         System.out.println(" ");

         }while(menu==1| menu==2|menu==3 |menu==4);
    }

//    private void addFirst(int no, String nama1, int noHP) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//       
    
}
