/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author rendy
 */
public class Mahasiswa {
   String nim ;
   String nama;
   String noTelp;
   
   public Mahasiswa(){
       
   }
   public Mahasiswa(String nim, String nama, String noTelp){
       this.nim= nim;
       this.nama= nama;
       this.noTelp= noTelp;
  
   }
   
   @Override
   public String toString (){
       return nim + "\t"+ nama +"\t" + noTelp;
   }
}

