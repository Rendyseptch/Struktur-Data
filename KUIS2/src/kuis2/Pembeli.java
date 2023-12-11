/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2;

/**
 *
 * @author rendy
 */
public class Pembeli {
    int no;
    String namaPembeli ;
    String NoHP;
     Pembeli prev;
     Pembeli next;
     
     Pembeli (Pembeli prev, int no,String b ,String c ,Pembeli next ){
        this.prev= prev;
        this.no = no;
        this.namaPembeli= b;
        this.NoHP=c;
        this.next= next;
    } 

    Pembeli(Object object, int no, String nama1, int noHP, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

