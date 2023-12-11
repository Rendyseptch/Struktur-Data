
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author rendy
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class nilai {
    String kdNilai;
    double nilai;
    Mahasiswa mhs;
    mataKuliah mk;
    
    public nilai(String kdNilai, double nilai, Mahasiswa mhs, mataKuliah mk){
        this.kdNilai = kdNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    List<mataKuliah> matkul = new ArrayList<>();
    
    public void tambahMhs(Mahasiswa... mahasiswa){
        mahasiswas.addAll (Arrays.asList(mahasiswa));
    }
    
    public void tambahMatkul(mataKuliah... matkuls){
        matkul.addAll (Arrays.asList(matkuls));
    }
    
    public void tampilMhs(){
        mahasiswas.stream().forEach(m-> {
            System.out.println("" + m.toString());
        });
    }
    
    
    public void tampilMatkul(){
        matkul.stream().forEach(mtk-> {
            System.out.println("" + mtk.toString());
        });
    }
    
    int linearSearchMhs(String nim){
        for(int i = 0; i <mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    
    
    int linearSearchMatkul(String matkuls){
        for(int i = 0; i <matkul.size(); i++){
            if(matkuls.equals(matkul.get(i).kode)){
                return i;
            }
        }
        return -1;
    }
    
    Mahasiswa cariObjMhs(String nim){
        for(int i = 0; i <mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return mahasiswas.get(i);
            }
        }
        return null;
    }
    
    mataKuliah cariObjMtk(String matkuls){
        for(int i = 0; i <matkul.size(); i++){
            if(matkuls.equals(matkul.get(i).kode)){
                return matkul.get(i);
            }
        }
        return null;
    }
    public String toString(int idx1, int idx2){
        return mahasiswas.get(idx1).nim + "\t" + mahasiswas.get(idx2).nama + "\t" +
                matkul.get(idx2) + "\t" + matkul.get(idx2).sks;
    }
    
    static Comparator<nilai> CompNilai = (n1, n2) -> {
        if(n1.nilai < n2.nilai){
            return -1;
        } else if(n1.nilai > (n2).nilai){
            return 1;
        } else{
            return 0;
            
        }
    };
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<nilai> nilaiX = new ArrayList<>();
        nilai n = new nilai("", 0, null, null);
         Mahasiswa m = new   Mahasiswa("20001", "Thalhah     ", "021xx1");
         Mahasiswa m1 = new  Mahasiswa("20002", "Zubair",    "021xx2");
         Mahasiswa m2 = new  Mahasiswa("20003", "Abdur-Rahman  ", "021xx3");
         Mahasiswa m3 = new  Mahasiswa("20004", "Sa'ad       ", "021xx4");
         Mahasiswa m4= new   Mahasiswa("20005", "Sa'id       ", "021xx5");
         Mahasiswa m5= new   Mahasiswa("20006", "Ubaidah     ", "021xx6");
        
        n.tambahMhs(m, m1, m2, m3, m4, m5);
        
        mataKuliah mk  = new mataKuliah("00001",   "Internet of Things\t\t", 3);
        mataKuliah mk1 = new mataKuliah("00002", "Algoritma dan Struktur Data\t", 2);
        mataKuliah mk2 = new mataKuliah("00002", "Algoritma dan Pemrograman\t", 2);
        mataKuliah mk3 = new mataKuliah("00002", "Praktikum Algoritma dan Struktur Data", 3);
        mataKuliah mk4 = new mataKuliah("00002", "Praktikum Algoritma dan Struktur Data", 3);

        n.tambahMatkul(mk, mk1, mk2, mk3, mk4);

        
        nilai n1 = null;
        String nimMhs, mkMhs;

        int pilih = 0;
        do{
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER ");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai ");
            System.out.println("2. Tampil Nilai ");
            System.out.println("3. Mencari Nilai Mahasiswa ");
            System.out.println("4. Urut Data Nilai ");
            System.out.println("5. Keluar ");
            System.out.println("************************************************");
            System.out.println("Pilih : ");
            pilih = sc.nextInt();
            System.out.println(" ");
           
             if(pilih==1){
                    System.out.println("Masukkan data ");
                    System.out.println("Kode\t : ");
                    String kd = sc.next();
                    System.out.println("Nilai\t : ");
                    double nilMhs = sc.nextDouble();
                    System.out.println(" ");
                    System.out.println("DAFTAR MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\tNama\t\tTelfon : ");
                    n.tampilMhs();
                    System.out.print("Pilih Mahasiswa By Nim : ");
                    nimMhs = sc.next();
                    Mahasiswa mhs;

                    mhs = n.cariObjMhs(nimMhs);
                    System.out.println(" ");
                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("************************************************");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS ");
                    n.tampilMatkul();
                    System.out.print("Pilih Mata Kuliah Bye Kode : ");
                    mkMhs = sc.next();
                    mk1 = n.cariObjMtk(mkMhs);
                    n1 = new nilai(kd, nilMhs, mhs, mk1);
                    nilaiX.add(n1);
             }
                   
             else if(pilih==2){
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\tNama\t\tKode\t\tMata Kuliah\t\tSKS\tNilai");
                    for(int i = 0; i < nilaiX.size(); i++){
                        n.linearSearchMhs(nilaiX.get(i).mhs.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).mhs.nim),
                            n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nilai);
                    }
             }
                   
               else if(pilih==3){

                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\tNama\t\tKode\t\tMata Kuliah\t\tSKS\tNilai");
                    int sks = 0;
                    for(int i=0; i<nilaiX.size(); i++){
                        n.linearSearchMhs(nilaiX.get(i).mhs.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).mhs.nim),
                                n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nilai);  
                    }
                  
                    System.out.print("Masukkan data mahasiswa (nim) : ");
                    String masukan = sc.next();
                    for(int i=0; i<nilaiX.size(); i++){
                        if(masukan.equalsIgnoreCase(nilaiX.get(i).mhs.nim)){
                            sks += n.matkul.get(i).sks;
                            n.linearSearchMhs(nilaiX.get(i).mhs.nim);
                            n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).mhs.nim),
                                n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nilai);  
                        }
                    }
               
                    System.out.println("Total SKS " + sks + " telah diambil ");
               }
                   
                else if(pilih==4){
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.println("NIM\tNama\t\tKode\t\tMata Kuliah\t\tSKS\tNilai");
                    nilaiX.sort(CompNilai);
                    for(int i=0; i<nilaiX.size(); i++){
                        n.linearSearchMhs(nilaiX.get(i).mhs.nim);
                        n.linearSearchMatkul(nilaiX.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(nilaiX.get(i).mhs.nim),
                          n.linearSearchMatkul(nilaiX.get(i).mk.kode)) + nilaiX.get(i).nilai);  
                    }
                }
           
       }while(pilih < 5);
    }
}
       

