/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2;

/**
 *
 * @author rendy
 */
public class DoubleLinkedListPembeli {
     Pembeli head;
    int size;
    
    public DoubleLinkedListPembeli(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
    return head==null;
    }
    public void addFirst(int no, String nama1,String  noHP){
        if (isEmpty()){
            head= new  Pembeli (null, no, nama1,noHP, null);
        }else {
             Pembeli newNode= new  Pembeli (null, no, nama1,noHP, head);
            head.prev= newNode;
            head= newNode;
        }
        size++;
    }
    public void addLast(int no, String nama1,String  noHP){
        if (isEmpty()){
            addFirst(no, nama1,  noHP);
        }else {
            Pembeli current=head;
            while (current.next !=null){
                current =current.next;
            }
            Pembeli newNode= new Pembeli (current,no, nama1,  noHP,  null);
            current.next= newNode;
        size++;
        }
    }
    public void print(){
        if (!isEmpty()) {
            Pembeli tmp = head;
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Masuk Resto Royal Delisah");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("No. \t Nama Pesanan \t");
            while(tmp!=null){
              
                System.out.print("| "+tmp.namaPembeli+"\t");
                System.out.print("| "+tmp.NoHP);
                System.out.println();
                tmp =tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List kosong");
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus! ");
        }else if (size==1){
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
     public void removeLast() throws Exception{
         if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus! ");
        }else if (head.next==null){
            head=null;
            size--;
            return;
     }
          Pembeli current= head;
         while (current.next.next!= null){
             current =current.next;
         }
         current.next=null;
         size--;
    }
     
}
