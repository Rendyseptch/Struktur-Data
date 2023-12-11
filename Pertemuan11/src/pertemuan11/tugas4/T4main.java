/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas4;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class T4main {
    public static void main(String[] args){
        SLLT4 sll = new SLLT4();
        Scanner sc = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        char pilih;
        int menu;
        do{
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data Terakhir");
            System.out.println("3. Cek mahasiswa Paling depan");
            System.out.println("4. Cek mahasiswa paling belakang");
            System.out.println("5. Mencari Data Mahasiswa Melalui Index");
            System.out.println("6. Tampilkan Data");
            System.out.print("Masukkan Pilihanmu: ");
            menu = sc.nextInt();
            System.out.println("");

            switch(menu){
                case 1:{
                    do{
                        System.out.print("NIM: ");
                        String nim = sc.next();
                        System.out.print("Nama: ");
                        String nama = sc.next();
                        System.out.print("Absen: ");
                        int absen = sc.nextInt();
                        System.out.print("IPK: ");
                        double ipk = sc.nextDouble();
                        System.out.print("Apakah anda ingin menambah data ?(y/n) : ");
                        pilih = sc.next().charAt(0);
                        sll.tambahData(nim, nama, absen, ipk);
                        System.out.println("");
                    } while (pilih == 'y' || pilih == 'Y');
                }
                break;
                case 2:{
                    sll.remove();
                    System.out.println("");
                }
                break;
                case 3:{
                    sll.antrianDepan();
                    System.out.println("");
                }
                break;
                case 4:{
                    sll.antrianBelakang();
                    System.out.println("");
                }
                break;
                case 5:{
                    System.out.print("Masukkan Index Pada Data Yang Dicari: ");
                    int idx = sc.nextInt();
                    sll.cariDataIndex(idx);
                    System.out.println("");
                }
                break;
                case 6:{
                    sll.print();
                    System.out.println("");
                }
                break;
            }
        } while (menu > 0 && menu < 6);
    }
}

