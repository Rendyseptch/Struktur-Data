    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas3.NodeT3;

/**
 *
 * @author rendy
 */
public class T3SingleLinkedList {
    NodeT3 head; //posisi awal linked list
    NodeT3 tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeT3 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void peek(){
        if(!isEmpty()){
            NodeT3 tmp = head;
            while(tmp != null){
                if(tmp == head){
                    System.out.println("Isi Stack Teratas = " + tmp.data);
                }
                tmp = tmp.next;
            }
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }

    public void push(String input){
        NodeT3 ndInput = new NodeT3(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Masih Kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            NodeT3 temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}
