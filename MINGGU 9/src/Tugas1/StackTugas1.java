/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;



/**
 *
 * @author rendy
 */
public class StackTugas1 {
    int size;
    int top;
    Tugas1Pakaian data[];
    
    public StackTugas1(int size){
        this.size=size;
        data=new Tugas1Pakaian[size];
        top=-1;
    }
        public boolean IsEmpty(){
            if (top==-1){
                return true;
            }else{
                return false;   
            }
        }   
        public boolean IsFull(){
            if (top==-size-1){
                return true;
            }else{
                return false;   
            }
        }
        public void push (Tugas1Pakaian pkn){
            if(!IsFull()){
                top++;
                data[top]= pkn;  
        }else {
                System.out.println("isi stack penuh");
             }
        }
        public void pop (){
            if(!IsEmpty()){
                Tugas1Pakaian x= data[top];
                top--;
                 System.out.println("Data yang keluar:" + x.jenis+" "+ x.warna+
                         " " + x.merk+" "+x.ukuran+" "+ x.harga);
        }else {
                System.out.println("stack masih kosong ");
             }
        }
        
        public void peek(){
             System.out.println("Elemen Teratas: " + data[top].jenis+ " "+ data[top].warna+
                         " "+ data[top].merk+" "+data[top].ukuran+" "+ data[top].harga);
        }
        public void print(){
            System.out.println("Isi stack: ");
            for (int i= top; i>=0; i--){
                System.out.println( data[i].jenis+" "+ data[i].warna+
                         " "+ data[i].merk+" "+data[i].ukuran+" "+ data[i].harga+" ");
            }
            System.out.println(" ");
        }
        public void clear(){
            if(!IsEmpty()){
                for (int i = top; i>=0; i--){
                    top--;
                }
                System.out.println("Stack telah dikosongkan");
            }else{
                System.out.println("Stack masih kosong");
            }
        }
        public void getMin(){
    double minHarga = data[0].harga;
        int idx=0;
        for(int i=0; i<=top; i++){
            if(minHarga > data[i].harga){
                minHarga = data[i].harga;
                idx = i;
            }
        }
        System.out.println("Harga pakaian paling murah adalah ");
        System.out.println(" jenis: "+data[idx].jenis );
        System.out.println(" warna: "+data[idx].warna  );
        System.out.println(" Merk: "+data[idx].merk );
        System.out.println(" Ukuran: "+ data[idx].ukuran );
        System.out.println(" Harga: "+ data[idx].harga );
    }
        
}
