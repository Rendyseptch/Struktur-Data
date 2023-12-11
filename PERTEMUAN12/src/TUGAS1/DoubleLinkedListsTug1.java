/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS1;



/**
 *
 * @author rendy
 */
public class DoubleLinkedListsTug1 {
    NodeTug1 depan , terakhir ;
    int size;
    
    public DoubleLinkedListsTug1(){
        depan=null;
        terakhir= null;
        size=0;
        
    }
    public boolean isEmpty(){
    return depan ==null;
    }

       public void Enqueue(int no, String nama){
           NodeTug1 newNode = new NodeTug1(null, no, nama, null);
           if (isEmpty()){
               depan =newNode;
               terakhir= newNode;
           }else{
               terakhir.next= newNode;
               terakhir= newNode;
           } 
           size++;
       }
       public void Dequeue() throws Exception{
           if (isEmpty()){
               throw new Exception("Antrian masih kosong , tidak dapat melakukan penghapusan");
           }else if(size==1){
               removeLast();
           } else{
               System.out.println(depan.nama+ " telah divaksin");
               depan= depan.next;
               depan.prev= null;
               size--;
           }
       }
       public void removeLast() throws Exception{
         if(isEmpty()){
            throw new Exception("Antrian masih kosong, tidak dapat dihapus! ");
        }else if (depan.next==null){
            depan=null;
            size--;
            return;
     }
         NodeTug1 current= depan;
         while (current.next.next!= null){
             current =current.next;
         }
         current.next=null;
         size--;
    }
       public void print(){
           if(!isEmpty()){
               NodeTug1 tmp= depan;
               System.out.println("+++++++++++++++++++++++");
               System.out.println("Daftar Pengantri Vaksin");
               System.out.println("+++++++++++++++++++++++"); 
               System.out.println("|Nomor   |Nama   |");
               while(tmp !=null ){
               System.out.println("|"+ tmp.no+ "     "+ "|"+ tmp.nama+ "   "+"|");
               tmp= tmp.next;
           }
               System.out.println("Sisa Antrian: "+size);
               System.out.println(" ");
               
           }else{
               System.out.println("Antrian Kosong");
           }
       }
    }

