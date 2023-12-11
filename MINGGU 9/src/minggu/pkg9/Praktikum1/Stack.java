/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg9.Praktikum1;

/**
 *
 * @author rendy
 */
public class Stack {
    int size;
    int top;
    Pakaian data[];
    
    public Stack(int size){
        this.size=size;
        data=new Pakaian[size];
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
        public void push (Pakaian pkn){
            if(!IsFull()){
                top++;
                data[top]= pkn;  
        }else {
                System.out.println("isi stack penuh");
             }
        }
        public void pop (){
            if(!IsEmpty()){
                Pakaian x= data[top];
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
        
        
}
