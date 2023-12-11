/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;




/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class tugas1Main {
      public static void menu(){
        System.out.println("Masukkan Operasi yang diinginkan ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek Data");
        System.out.println("--------------------");
    }
       public static void main (String[]args){
      Scanner sc =new Scanner(System.in);
      System.out.print("Masukkan kapasitas queue:");
      int n= sc.nextInt();
      tugas1 Q= new tugas1 (n);
      
      int pilih;
           do{
            menu();
            pilih =sc.nextInt();
            switch(pilih){
            
               case 1:
                   if(Q.IsFull()){
                       System.out.println("Antrian Penuh");
                   }else{
                 System.out.print("Masukkan data baru :"); 
                 int dataMasuk= sc.nextInt();
                 Q.Enqueue(dataMasuk);
                   }
                 break;
               case 2:
                   int dataKeluar= Q.Dequeue();
                   if (dataKeluar !=0){
                   System.out.print("Data yang dikeluarkan"+dataKeluar);  
                   break;
                   }
               case 3:
                   Q.print();
                   break;
               case 4:
                   Q.peek();
                   break;
               case 5:
                   Q.clear();
                   break;
               case 6:
                   System.out.println("Mencari Posisi ke: "+" ");
                   int cari= sc.nextInt();
                   Q.peekPosition(cari);
                    System.out.println("Data berada pada posisi ke: "+ (cari+1));
                   break;
               case 7:
                   System.out.println("Mencari Posisi ke: "+" ");
                   int dt= sc.nextInt();
                    int p= Q.peekData(dt-1);
                   System.out.println("Data berada pada posisi ke: "+ dt +" bernilai " +p);
                   break;
           
               }
               }while(pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5 || pilih==6 || pilih==7);
           } 
}
