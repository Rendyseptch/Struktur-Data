/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

/**
 *
 * @author Name
 */
import java.util.Scanner ;
public class Main2 {

     public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        for(int i=0; i<jumMhs; i++){
            System.out.println("Nama = ");
            String nama = s1.nextLine();
            System.out.println("Thn masuk = ");
            int thn = s.nextInt();
            System.out.println("Umur = ");
            int umur = s.nextInt();
            System.out.println("IPK = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("------------------------------------");
        System.out.println("Data mahasiswa sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk= ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasra ipk");
        data.selectionSort();
        data.tampil();
    }
}