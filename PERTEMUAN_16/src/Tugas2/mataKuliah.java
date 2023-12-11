/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author rendy
 */
public class mataKuliah {
   String kode;
   String matakuliah;
   int sks;
   
   public mataKuliah(){
       
   }
   public mataKuliah(String kode, String matakuliah, int sks){
       this.kode= kode;
       this.matakuliah= matakuliah;
       this.sks= sks;
  
   }
   
   @Override
   public String toString (){
       return kode+ "\t"+ matakuliah +"\t" + sks;
   } 
}
