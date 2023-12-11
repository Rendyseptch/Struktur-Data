/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas4;

/**
 *
 * @author rendy
 */
public class SLLT4 {
    NodeT4 head;
    NodeT4 tail;

    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            NodeT4 tmp = head;
            int urut = 0;
            System.out.println("Mahasiswa: ");
            while (tmp != null){
                System.out.println("Mahasiswa ke- " + urut + " : " + tmp.nim +
                        " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                tmp = tmp.next;
                urut++;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void antrianDepan(){
        if (!isEmpty()){
            NodeT4 tmp = head;
            System.out.println("Mahasiswa paling depan : " + tmp.nim + " " +
                    tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void antrianBelakang(){
        if (!isEmpty()){
            NodeT4 tmp = head;
            while (tmp != null){
                if (tmp == tail){
                    System.out.println("Mahasiswa  Palng belakang : " + tmp.nim +
                            " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                }
                tmp = tmp.next;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void tambahData(String nim, String nama, int absen, double ipk){
        NodeT4 ndInput = new NodeT4(nim, nama, absen, ipk, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void cariDataIndex(int index){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong");
        } else{
            NodeT4 tmp = head;
            for (int i = 0; i < index; i++){
                tmp = tmp.next;
            }
            System.out.println("Mahasiswa Pada Index Ke- " + index + " adalah: "
                    + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }
    }
    public void remove(){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong, Tidak Dapat melakukan penghapusan !");
        } else if (head == tail){
            head = tail = null;
        } else{
            NodeT4 temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}

