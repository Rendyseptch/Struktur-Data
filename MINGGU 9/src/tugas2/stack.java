/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;



/**
 *
 * @author rendy
 */
public class stack {
   int size;
    int top;
    Struk data[];
    
    public stack(int size){
        this.size=size;
        data=new Struk[size];
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
        public void push (Struk stk){
            if(!IsFull()){
                top++;
                data[top]= stk;  
        }else {
                System.out.println("isi stack penuh");
             }
        }
        public void pop (){
            if(!IsEmpty()){
                Struk x= data[top];
                top--;
                System.out.println("Data yang keluar:" );
                System.out.println( "no Transaksi   :"+ x.noTransaksi);
                System.out.println( "Tanggal        :"+ x.tanggal);
                System.out.println( "jumlah Barang  :"+ x.jumlah);
                System.out.println( "Total Harga    :"+ x.total);
                System.out.println("-------------------------------");
               
        }else {
                System.out.println("stack masih kosong ");
             }
        }
        
        public void peek(){
             System.out.println("Elemen Teratas: " + data[top].noTransaksi+ " "+ data[top].tanggal+
                         " "+ data[top].jumlah+" "+data[top].total);
        }
        public void print(){
            System.out.println("Isi stack: ");
             System.out.println("===========================================");
            for (int i= top; i>=0; i--){
//                
                System.out.println( "no Transaksi   :"+data[i].noTransaksi);
                System.out.println( "Tanggal        :"+ data[i].tanggal);
                System.out.println( "jumlah Barang  :"+ data[i].jumlah);
                System.out.println( "Total Harga    :"+data[i].total);
                System.out.println("------------------------------------");
                
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
