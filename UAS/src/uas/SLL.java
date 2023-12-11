/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class SLL {
    
    Scanner sc = new Scanner(System.in);
    Node head;
    Node tail;
    Pajak pjk;
    Pajak pjk2;
    
    int nominal;
    int nominaltotal;
    int kode = 0;
    int denda;
    int totalakhir;

    boolean IsEmpty() {
        return head == null;
    }

    boolean IsEmpty2() {
        return pjk == null;
    }

    void print() {
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.println("Data Kendaraan  ");
            System.out.print("TNKB   ");
            System.out.print("Nama   ");
            System.out.print("Roda   ");
            System.out.print("CC     ");
            System.out.print("Tahun     ");
            System.out.print("Bulan Bayar   ");
            
            while (tmp != null) {
                System.out.println();
                System.out.print(tmp.data.TKNB + "   ");
                System.out.print(tmp.data.nama + "    ");
                System.out.print(tmp.data.jenis + "    ");
                System.out.print(tmp.data.cc + "    ");
                System.out.print(tmp.data.tahun + "     ");
                System.out.print(tmp.data.bulan + "     ");
                tmp = tmp.next;

            }
            System.out.println(" ");
        } else {
            System.out.println("Linked List Masih Kosong");
        }
    }

    boolean find(int TKNB) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data.TKNB == TKNB) {
                kode++;
                System.out.println("Data Ada ");
                System.out.print("Jenis Kendaraan ");
                System.out.println("Roda : " + tmp.data.jenis);
                System.out.print("CC Kendaraan : ");
                System.out.println(tmp.data.cc + "CC");
                
                if (tmp.data.jenis == 2) {
                    if (tmp.data.cc < 100) {
                        System.out.println("Tarif pajak : 100000");
                        nominal = 100000;
                    } else if (tmp.data.cc <= 250) {
                        System.out.println("Tarik pajak : 250000");
                        nominal = 250000;
                    } else {
                        System.out.println("Tarik pajak : 500000");
                        nominal = 500000;
                    }
                } else if (tmp.data.jenis == 4) {
                    if (tmp.data.cc < 1000) {
                        System.out.println("Tarif pajak : 750000");
                        nominal = 750000;
                    } else if (tmp.data.cc <= 2500) {
                        System.out.println("Tarik pajak : 1000000");
                        nominal = 1000000;
                    } else {
                        System.out.println("Tarik pajak : 1500000");
                        nominal = 1500000;
                    }
                }
                System.out.print("Bulan pembayaran : ");
                System.out.println("Bulan " + tmp.data.bulan);
                System.out.println("Bulan Bayar : ");
                int bayar = sc.nextInt();
                int b = bayar - tmp.data.bulan;
                System.out.println("Telat bayar " + b + " Bulan");
                if (b <= 3) {
                    System.out.println("Denda Bayar 50000");
                    denda = 50000;
                    nominaltotal = nominal + 50000;
                } else {
                    nominaltotal = nominal * 50000;
                }
                addLast_pt2(tmp.data, kode, nominal, denda, bayar);
                totalakhir += nominaltotal;
                return true;
            }
            tmp = tmp.next;
        }
        System.out.println("Data tidak ada");
        return false;
    }

    void addFirst(Kendaraan input) {
        Node ndInput = new Node(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Kendaraan input) {
        Node ndInput = new Node(input, null);
        if (IsEmpty()) {
            head = ndInput;
        } else {
            tail.next = ndInput;
        }
        tail = ndInput;
    }

    void addLast_pt2(Kendaraan input, int kode, int nominal, int denda, int bulanbayar) {
        Pajak p = new Pajak(input, kode, nominal, denda, bulanbayar, null);
        if (IsEmpty2()) {
            pjk = p;
        } else {
            pjk2.next = p;
        }
        pjk2 = p;
    }

    void print_pt2() {
        if (!IsEmpty()) {
            Pajak tmp = pjk;
            System.out.println("Data Pajak Transaksi    ");
            System.out.print("TNKB  ");
            System.out.print("Kode  ");
            System.out.print("Nominal   ");
            System.out.print("Denda     ");
            System.out.print("Bulan Bayar   ");
            
            while (tmp != null) {
                System.out.println();
                System.out.print(tmp.data.TKNB + "  ");
                System.out.print(tmp.kode + "   ");
                System.out.print(tmp.nominal + "    ");
                System.out.print(tmp.denda + "  ");
                System.out.print(tmp.bulanbayar + " ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Masih Kosong");
        }
    }
}

