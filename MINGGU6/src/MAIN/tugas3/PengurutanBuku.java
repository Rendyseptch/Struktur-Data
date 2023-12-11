/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAIN.tugas3;

/**
 *
 * @author rendy
 */
public class PengurutanBuku {
   Buku bk[]= new Buku[4];   
   int a;
   
 public void tambah(Buku b){
        if(a< bk.length){
            bk[a]=b;
            a++;
        }else{
            System.out.println("Data Penuh");
        }
    }
 void tampil(){
        for(Buku m : bk){
            m.tampilBuku();
        }
    }

 
 void bubblesort(){
for (int i=0; i<bk.length-1;  i++){
    for (int j=i;j<bk.length-i;j++){
        if(bk[j].UkuranBuku> bk[j-i].UkuranBuku){
            Buku temp=bk[j];
            bk[j]=bk[j-1];
            bk[j-1]=temp;
        }
    }
    }
}


void selectionSort(){
    for(int i=0; i<bk.length-1; i++){
            int idxMin=i;
            for(int j=i+1; j< bk.length; j++){
                if(bk[j].JumlahHalaman<bk[idxMin].JumlahHalaman){
                   idxMin=j;
                }
            }
            Buku temp = bk[idxMin];
            bk[idxMin] = bk[i];
            bk[i] = temp;
        }
    }   
}
