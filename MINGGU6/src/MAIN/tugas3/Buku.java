/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN.tugas3;

/**
 *
 * @author rendy
 */
public class Buku {
    public String NamaBuku;
    public int JumlahHalaman;
    public double UkuranBuku;

    public Buku(String nam, int jhal, double uk){
        NamaBuku = nam;
        JumlahHalaman = jhal;
        UkuranBuku = uk;
    }

    void tampilBuku(){
        System.out.println("Judul Buku       : " +NamaBuku);
        System.out.println("Jumlah Halaman   : " +JumlahHalaman);
        System.out.println("Tinggi Buku      : " +UkuranBuku);
        
        
        
        if(UkuranBuku==25){
            System.out.println("Ukuran Buku B5");
        }else if(UkuranBuku==29.7){
            System.out.println("Ukuran Buku A4");
        }else if(UkuranBuku==50) {
            System.out.println("Ukuran Buku B3");
        }else if(UkuranBuku==70) {
            System.out.println("Ukuran Buku B2");
        }else{
            System.out.println("Ukuran BUku yang Anda Masukkan Salah");
        }
    }
}
