/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7.tugas.Tugas2;

/**
 *
 * @author rendy
 */
public class tugas2 {
    int nilaiA,nilaiB,nilaiC, total;
    String nama;
    tugas2 (String nm, int Sca, int Scb, int Scc, int ttl){
        nama = nm;
        nilaiA = Sca;
        nilaiB = Scb;
        nilaiC = Scc;
        total = ttl;
    }
    void tampilData(){
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai A : "+nilaiA);
        System.out.println("Nilai B : "+nilaiB);
        System.out.println("Nilai C : "+nilaiC);
        System.out.println("Nilai Total : "+total);
    }
}
   
