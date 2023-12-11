/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas2;



/**
 *
 * @author rendy
 */
public class SingleLinkedListT2 {
       NodeT2 head; //posisi awal linked list
    NodeT2 tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeT2 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    
    public void addFirst(char input) {
        NodeT2 ndInput = new NodeT2(input, null);
        if (isEmpty()) {//jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
 
    public void addLast(char input) {
        NodeT2 ndInput = new NodeT2(input, null);
        if (isEmpty()) {
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    
    public void insertAfter(char key, char input){
        NodeT2 ndInput = new NodeT2(input, null);
        NodeT2 temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail=ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertAt(int index, char input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            NodeT2 temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new NodeT2(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }
   
    public void insertBefore(int key, char input){
        NodeT2 ndInput = new NodeT2(input, null);
        NodeT2 temp = head;
        do{
            if(temp.data == key){
                this.addFirst(input);
                break;
            }else if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }

}
  


