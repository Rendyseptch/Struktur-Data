/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author rendy
 */
public class QueueMahasiswa {
    Mahasiswa[] antri;
    int front;
    int rear;
    int size;
    int max;
    
    QueueMahasiswa(int m){
        max = m;
        antri = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
     public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }
    
     public void Enqueue(Mahasiswa dt){
        if (IsFull()){
            System.out.println("Antrian sudah penuh");
        }else{
            if (IsEmpty()){
                front = rear = 0;
            }else{
                rear++;
            }
        }
        antri[rear] = dt;
        size++;
    }

    public Mahasiswa Dequeue(){
        Mahasiswa m = new Mahasiswa();
        if (IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            m = antri[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if (front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return m;
    }
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + antri[front].nim + " " + antri[front].nama + " " 
                    + antri[front].absen + " " + antri[front].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void peekrear(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + antri[rear].nim + " " + antri[rear].nama + " " 
                    + antri[rear].absen + " " + antri[rear].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    public void print(){
        if (IsEmpty()){
            System.out.println("Antrian masih ksong");
        }else{
            int i = front;
            while (i != rear){
                System.out.print(antri[i]+"-");
                i = (i + 1) % max;
            }
            System.out.println("NIM: " + antri[i].nim);
            System.out.println("nama: " + antri[i].nama);
            System.out.println("absen: " + antri[i].absen);
            System.out.println("IPK: " + antri[i].ipk);
            System.out.println("Jumlahkan elemen = " + size);
        }
    }
    
    public void peekPosition(String data){
        int result=0;
        
        for (int x=0; x<antri.length;x++){
            if(antri[x].nim.equalsIgnoreCase(data)){
                result=x;
                System.out.print(x+1);
                break;
            }
            result = -1;
        }
    }
    public void printMahasiswa(int position){
        String datanim;
        String datanama;
        int dataabs=-1;
        double dataipk;
        if(position <antri.length && position >= 0){
            datanim = antri[position].nim;
            datanama = antri[position].nama;
            dataabs = antri[position].absen;
            dataipk = antri[position].ipk;
        System.out.println("NIM: " + datanim);
            System.out.println("nama: " + datanama);
            System.out.println("absen: " + dataabs);
            System.out.println("IPK: " + dataipk);
        }
    }
}

