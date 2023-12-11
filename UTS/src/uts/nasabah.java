/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author rendy
 */
        import java.util.Scanner;
public class nasabah{

 public String [] nama;
 public int[] noRekening ;
 public int[] nik;
 public int[] saldo;
 public int jumdata;
        
 public  nasabah(String Nm[], int nr[], int nk[], int sld[], int jmldata){
      jumdata=jmldata;
       nama=new String[jmldata];
       noRekening  =new  int [jmldata];
       nik=new int [jmldata];
       saldo=new int [jmldata];
      
       for(int i=0; i<jumdata; i++) {   
           nama[i]= Nm[i];
           noRekening [i]= nr[i];
           nik[i]= nk[i];
           saldo[i]= sld[i];           
 }
 }
  void tampilData(){
           for(int i=0; i< jumdata; i++){
           System.out.println("Data nasabah ke- " + (i+1));
           System.out.println(" Nama Nasabah: " +nama[i]);
           System.out.println(" No Rekening : " +noRekening[i]);
           System.out.println(" nik : " +nik[i]);
           System.out.println(" Saldo: " +saldo[i]);
           System.out.println("----------------------------------------" );
            }
        } 
    void mengurutkanIns(){
        for (int i= 1; i<=saldo.length-1; i++){
           int temp=saldo[i];
           String temp1= nama[i];
           int temp2= noRekening[i];
           int temp3= nik[i];
//           int temp4= saldo[i];
           int j=i-1;
           while (j>=0 && saldo[j]> temp){
               saldo[j+1]=saldo[j];
               nama[j+1]=nama[j];
               noRekening[j+1]=noRekening[j];
               nik[j+1]= nik[j];
              
               j--;
           }
            saldo[j+1]=temp;
           nama[j+1]=temp1;
           noRekening[j+1]=temp2;
           nik[j+1]=temp3;
         
        }
    }
        
    
    void menambah(){
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Nomor Rekening yang ingin di cari : ");
          int cari = input.nextInt(); 
         int r =0 ;
          for (int i = 0; i < noRekening.length; i++) {
              if (cari==noRekening[i]) {
                  r=+i;
                  System.out.println( "nama       : "+nama[i]);
                  System.out.println( "no rekening: "+noRekening[i]);
                  System.out.println( "nik        : "+nik[i]);
                  System.out.println( "saldo      : "+saldo[i]);
                 
              }
              }
              System.out.println("Masukkan jumlah tambah: ");
              int tb = input.nextInt();
              saldo[r]+=tb;
              System.out.println(saldo[r]);
         
}
    void mengurangi(){
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Nomor Rekening yang ingin di cari : ");
          int cari = input.nextInt(); 
         int r =0 ;
          for (int i = 0; i < noRekening.length; i++) {
              if (cari==noRekening[i]) {
                  r=i;
                  System.out.println( "nama       : "+nama[i]);
                  System.out.println( "no rekening: "+noRekening[i]);
                  System.out.println( "nik        : "+nik[i]);
                  System.out.println( "saldo      : "+saldo[i]);                 
              }
          }
              System.out.println("Masukkan jumlah tambah: ");
              int krg = input.nextInt();
              saldo[r]-=krg;
              System.out.println(saldo[r]);
         
}
    
   
    void mencariData(){
          Scanner input = new Scanner(System.in);
          System.out.print("Masukkan Nomor Rekening yang ingin di cari : ");
          int cari = input.nextInt();
          for (int i = 0; i < noRekening.length; i++) {
              if (cari==noRekening[i]) {
                  System.out.println( "nama       : "+nama[i]);
                  System.out.println( "no rekening: "+noRekening[i]);
                  System.out.println( "nik        : "+nik[i]);
                  System.out.println( "saldo      : "+saldo[i]);

              }
              
        }   
}
    
}
     
    
 
