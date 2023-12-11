/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas4;

/**
 *
 * @author rendy
 */
public class NodeT4 {
    String nim, nama;
    int absen;
    double ipk;
    NodeT4 next;

   public NodeT4(String nim, String nama, int absen, double ipk, NodeT4 berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = berikutnya;
    }
}

