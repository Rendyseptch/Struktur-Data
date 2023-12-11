/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author rendy
 */
public class tugas1 {
 int []dta;
 int front;
 int rear;
 int size;
 int max;

    
 
 public tugas1 (int n){
     max=n;
     dta= new int [max];
     size=0;
     front= rear=-1;
     
 }
  public boolean IsEmpty(){
            if (size==0){
                return true;
            }else{
                return false;   
            }
        }   
  public boolean IsFull(){
            if (size==max){
                return true;
            }else{
                return false;   
            }
        }
         
    public void peek(){
        if(!IsEmpty()){
             System.out.println("Elemen Terdepan: " + dta[front]);
        }else{
             System.out.println("Queue masih kosong");
        }
    }


            
   public void print(){
       if(IsEmpty()){
       System.out.println("Queue Masih kosong");
       }else{
           int i=front ;
           while(i!=rear){
              System.out.print(dta[i]+" ");
              i= (i+1)% max;
           }
           System.out.println(dta[i]+" ");
           System.out.println("Jumlah Elemen"+size);
       }
   }
      public void clear(){
          if(!IsEmpty()){
              front =rear=-1;
              size=0;
              System.out.println("Queue Berhasil dikosongkan");
          }else{
               System.out.println("Queue masih kosong");
          }
      }
      public void Enqueue(int dt){
          if(IsFull()){
          System.out.println("Queue sudah penuh");
      }else{
           if(IsEmpty()){
          front=rear=0;
          }else{
               if (rear==max-1){
                   rear=0;
               }else{
                   rear++;
               }
           }
           dta [rear]=dt;
           size++;
          }
    }
      public int Dequeue(){
          int dt=0;
          if(IsEmpty()){
          System.out.println("Queue masih kosong");
      }else{
           dt= dta[front];
           size--;
           if (IsEmpty()){
               front=rear=-1; 
           }else{
               if(front==max-1){
                   front=0;
               }else{
                   front++;
                   
               }
           }
        }
          return dt; 
          
      }
     
     
      public void peekPosition(int Data){
          int result=0;
          
          for (int x =0; x < dta.length; x++){
              if(dta[x]==Data){
                  result= x;
                  break;
              }
              result =-1;
              
          }
          
      }
      public int peekData(int position){
           int data=-1;
          if(position< dta.length && position >=0){
              data= dta[position];
          }
         return data;
      }

}

