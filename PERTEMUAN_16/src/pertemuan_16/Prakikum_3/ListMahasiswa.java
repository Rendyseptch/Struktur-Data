/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_16.Prakikum_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author rendy
 */
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void  update (int index, Mahasiswa mhs){
        mahasiswas.set (index, mhs);
    }
    public void tampil (){
        mahasiswas.stream().forEach(mhs->{
            System.out.println("" + mhs.toString());
        });
    }
    int binarySearch(String nim){
        for (int i= 0; i< mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[]args){
        ListMahasiswa lm= new ListMahasiswa();
        Mahasiswa m= new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1= new Mahasiswa("201235", "Akhaleema", "021xx2");
        Mahasiswa m2= new Mahasiswa("201236", "Shannum", "021xx3");
        Mahasiswa m3= new Mahasiswa("201237", "Triandika", "021xx4");
        Mahasiswa m4= new Mahasiswa("201238", "Dewi", "021xx5");
        Mahasiswa m5= new Mahasiswa("201239", "Sonya", "021xx6");
        Mahasiswa m6= new Mahasiswa("201230", "Riza", "021xx7");
        Mahasiswa m7= new Mahasiswa("2012110", "Amin", "021xx8");
        Mahasiswa m8= new Mahasiswa("201211", "Edo", "021xx9");
        //menambahkan objek mahasiswa
        lm.tambah(m,m1,m2,m4,m5,m6,m7,m8);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa 
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235","Akhaleema lela", "021xx2"));
       
       
        System.out.println("");
        lm.tampil();
    
    }

}
   

