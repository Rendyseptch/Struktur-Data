/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author rendy
 */ import java.util.Scanner;
public class QueueMahasiswaMain {
   

    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cetak semua Antrian");
        System.out.println("4. Cetak antrian terdepan");
        System.out.println("5. Cetak antrian paling belakang");
        System.out.println("6. Cari posisi mahasiswa");
        System.out.println("7. mencari data berdasarkan posisi");
        System.out.println("-------------------------");
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kapasitas queue: ");
        int n = sc.nextInt();
        QueueMahasiswa q = new QueueMahasiswa(n);
        int pilih = 0;
        do{
            menu();
            System.out.println("Masukkan pilihan");
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    if(q.IsFull()){
                        System.out.println("PENUH");
                    }else{
                        System.out.print("Masukkan nim: ");
                        String nim = sc.next();
                        System.out.print("Masukkan nama: ");
                        String nama = sc.next();
                        System.out.print("Masukkan absen: ");
                        int absen = sc.nextInt();
                        System.out.print("Masukkan IPK: ");
                        double ipk = sc.nextDouble();
                        Mahasiswa mhs = new Mahasiswa(nim,nama,absen,ipk);
                    q.Enqueue(mhs);
                    }
                    break;
                case 2:
                    Mahasiswa data = q.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen) && data.ipk != 0){
                        System.out.println("antrian yang keluar: "+ data.nim + " "+ data.nama + " " +data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                     q.print();
                     
                    break;
                case 4:
                   q.peek();
                    break;
                case 5:
                    q.peekrear();
                case 6:
                    System.out.println("Masukkan NIM untuk mencari di posisi berapa");
                    String cari = sc.next();
                    System.out.print("data berada di posisi ke- "+" "  );
                    q.peekPosition(cari);
                    break;
                case 7:
                    System.out.println("Masukkan posisi");
                    int dt = sc.nextInt();
                    System.out.print("data berada di posisi ke-  " +" ");
                    q.printMahasiswa(dt-1);
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 | pilih == 5 | pilih == 6 | pilih == 7);
    }
}

