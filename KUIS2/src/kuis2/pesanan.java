/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2;

/**
 *
 * @author rendy
 */
public class pesanan {
    int KodePesanan;
    String NamaPesanan;
    int harga;
     pesanan prev;
     pesanan next;
     
     
      pesanan (pesanan prev, int a ,String b , int d, pesanan next ){
        this.prev= prev;
        this.KodePesanan= a;
        this.NamaPesanan=b;
        this.harga=d;
        this.next= next;    } 
}
