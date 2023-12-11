/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;


/**
 *
 * @author rendy
 */
public class DLLTugas2 {
    NodeFilm head;
    int size;
    
    public DLLTugas2(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
    return head==null;
    }
    public void addFirst(int id, String judul, double rate ){
        if (isEmpty()){
            head= new NodeFilm (null, id,judul, rate, null);
        }else {
            NodeFilm newNode= new NodeFilm(null, id, judul,rate, head);
            head.prev= newNode;
            head= newNode;
        }
        size++;
    }
    public void addLast(int id, String judul, double rate){
        if (isEmpty()){
            addFirst(id, judul, rate);
        }else {
            NodeFilm current=head;
            while (current.next !=null){
                current =current.next;
            }
            NodeFilm newNode= new NodeFilm (current, id,judul,rate,  null);
            current.next= newNode;
        size++;
        }
    }
    public void add(int id, String judul, double rate, int index)throws Exception{
        if(isEmpty()){
            addFirst(id, judul, rate);
        }else if (index <0 || index > size){
            throw new Exception("nilai index di luar batas  ");
        }else{
            NodeFilm current =head;
            int i=0;
            while (i< index){
                current= current.next;
                i++;
            }
            if (current.prev==null){
                NodeFilm newNode= new NodeFilm (null, id, judul, rate, current);
                current.prev= newNode;
                head= newNode;
            }else {
                NodeFilm newNode= new NodeFilm (current.prev, id, judul, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size =0;
    }

      public void print (){
        if(!isEmpty()){
            NodeFilm tmp= head;
            while (tmp != null){
                System.out.println("ID :"+tmp.id + "\t");
                System.out.println("Judul Film :"+tmp.judul + "\t");
                System.out.println("Rating Film :"+tmp.rate + "\t");
                tmp=tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println( "Linked List Kosong");
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
         NodeFilm current= head;
         while (current.next.next!= null){
             current =current.next;
         }
         current.next=null;
         size--;
    }
     public void remove(int index) throws Exception{
         if(isEmpty() || index >= size){
              throw new Exception("nilai index diluar batas ");
         }else if (index==0){
             removeFirst();
         }else{
             NodeFilm current= head;
             int i=  0;
             while (i< index){
                 current =current.next;
                 i++;
             }
             if (current.next == null){
                 current.prev.next =null;
             }else if (current.prev == null ){
                 current =current.next;
                 current.prev=null;
                 head= current;
             }else {
                 current.prev.next =current.next;
                 current.prev.next =current.prev;
             }
             size--;
         }
     }
     public String getFirst() throws Exception{
         if (isEmpty()){
             throw new Exception("Linked List Kosong ");
         }
         return(head.id+head.judul+ head.rate);
     }
      public String getLast() throws Exception{
      if (isEmpty()){
             throw new Exception("Linked List Kosong  ");
         }
      NodeFilm tmp =head;
      while (tmp.next != null){
         tmp= tmp.next;
      }
      return(tmp.id +tmp.judul+ tmp.rate);
      }
      
       public String get(int index) throws Exception{
      if (isEmpty()|| index >= size ){
             throw new Exception("Nilai indexdi luar batas ");
         }
      NodeFilm tmp= head;
      for (int i=  0; i< index; i++ ){
          tmp= tmp.next;
      }
      return (tmp.id +tmp.judul+ tmp.rate);
}
      
        public void Search(int id){
            NodeFilm tmp= head;
            while (tmp != null){
                if(id==tmp.id){
                System.out.println("ID :"+tmp.id + "\t");
                System.out.println("Judul Film :"+tmp.judul + "\t");
                System.out.println("Rating Film :"+tmp.rate + "\t");
            
            }
                tmp= tmp.next;
           } 
        }
        
        public void sort(){
            NodeFilm current= null, index=null;
           String temp;
           Double tmp;
           if(head==null){
               return;
           }else{
               for (current= head; current.next !=null; current= current.next){
                   for(index=current.next; index!=null; index= index.next){
                     if(current.rate<index.rate){
                       tmp= current.rate;
                       current.rate=index.rate;
                       index.rate=tmp;
                       temp=current.judul;
                       current.judul=index.judul;
                       index.judul=temp;
                     }
                  }
               }
           }
        }
}
