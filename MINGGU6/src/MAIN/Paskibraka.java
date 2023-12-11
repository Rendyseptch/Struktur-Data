/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN;

/**
 *
 * @author rendy
 */
public class Paskibraka {
   
    public String nama,kelas;
    public int tinggi;
    
    Paskibraka(String a,  String b, int c ){
        nama = a;
        kelas = b;
        tinggi = c;
    }
          
    void tampilIdentitas(){
        System.out.println("Nama= "+nama);
        System.out.println("Tahun Masuk= "+kelas);
        System.out.println("umur= "+tinggi);
    }     
}

