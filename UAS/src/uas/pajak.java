/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author rendy
 */
public class Pajak {
   int nominal;
   int denda; 
   int bulanbayar;
   int kode;
   
   Kendaraan data;
   Pajak next;
    
    Pajak(Kendaraan data,int kode,int nominal,int denda,int bulanbayar,Pajak next){
        this.data = data;
        this.kode = kode;
        this.nominal = nominal;
        this.denda = denda;
        this.bulanbayar = bulanbayar;
        this.next = next;
    }
}
