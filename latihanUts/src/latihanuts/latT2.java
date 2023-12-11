/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanuts;

/**
 *
 * @author rendy
 */
public class latT2 {
    public String nama[];
    public int nilaiA[];
    public int nilaiB[];
    public int nilaiC[];
    public int total[];
    int jumdata;


public latT2( String Nm[], int nA[], int nB[], int nC[], int tot[], int jmldata){
      jumdata=jmldata;
       nama=new String[jmldata];
       nilaiA =new  int [jmldata];
       nilaiB=new int [jmldata];
       nilaiB=new int [jmldata];
       total = new int [jmldata];
       for(int i=0; i<jumdata; i++) {
           nama[i]= Nm[i];
           nilaiA[i]= nA[i];
           nilaiB[i]= nB[i];
           nilaiC[i]= nC[i];   
           total[i] = tot[i];
           
}
       }
       void tampilData(){
           for(int i=0; i< jumdata; i++){
           System.out.print(" Nama Mahasiswa: " +nama[i]);
           System.out.print(" Nilai A: " +nilaiA[i]);
           System.out.print(" Nilai B: " +nilaiB[i]);
           System.out.print(" Nilai C: " +nilaiC[i]);
           System.out.print(" jumlah nilai " +total[i]);
           
       }
    }
       void insertion(){
           for (int i= 1; i<=total.length-1; i++){
           int temp=total[i];
           String temp1= nama[i];
           int temp2= nilaiA[i];
           int temp3= nilaiB[i];
           int temp4= nilaiC[i];
           int j=i-1;
           while (j>=0 && total[j]> temp){
               total[j+1]=total[j];
               nama[j+1]=nama[j];
               nilaiA[j+1]=nilaiA[j];
               nilaiB[j+1]= nilaiB[j];
               nilaiC[j+1]=nilaiC[j];
               j--;
           }
           total[j+1]=temp;
           nama[j+1]=temp1;
           nilaiA[j+1]=temp2;
           nilaiB[j+1]=temp3;
           nilaiC[j+1]=temp4;
        }
       }
       

}

