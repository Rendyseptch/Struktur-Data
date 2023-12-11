/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7.tugas;

/**
 *
 * @author rendy
 */
public class tugas1 {
   public String [] barang;  
   public int [] stok;
   public int [] harga;
   public int jumData;
   
  
   public tugas1(String brg[], int hrg[], int stk[], int jmlData){
       jumData=jmlData;
       barang=new String[jmlData];
       stok=new  int [jmlData];
       harga=new int [jmlData];
       for(int i=0; i<jumData; i++){
           stok[i]=stk[i];
           barang[i]=brg[i];
           harga[i]=hrg[i] ;
 
       }
   }
   void tampilData(){
       for (int i=0; i<jumData; i++){
           System.out.println("Nama Barang:  "+barang[i]); 
           System.out.println("Harga Barang:  "+harga[i]); 
           System.out.println("Stok:  "+stok[i]); 
       }
       System.out.println(" ");
   }
       void Insertion(){
       for (int i= 1; i<=stok.length-1; i++){
           int temp=stok[i];
           String temp1=barang[i];
           int temp2=harga[i];
           int j=i-1;
        while (j>=0 && stok[j] < temp){
              stok[j+1]=stok[j];
               barang[j+1]=barang[j];
               harga[j+1]=harga[j];
                j--;
               
           }
               stok[j+1]=temp;
               barang[j+1]=temp1;
               harga[j+1]=temp2;
              
            }
       }
        void shellSort(){
        int interval;
        for (interval = jumData/2; interval>0; interval/=2){
            for (int i=interval; i<jumData; i+=1){
                
           int temp=stok[i];
           String temp1=barang[i];
           int temp2=harga[i];
                int j;
                for (j=i; j>=interval && stok[j-interval]<temp; j-=interval){
                    stok[j] = stok[j-interval];
                    barang [j] = barang[j-interval];
                    harga[j] = harga[j-interval];
                }
                stok [j] = temp;
                barang[j]=temp1;
                harga[j]= temp2;  
            }
        }
    }
   
    }

