/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

/**
 *
 * @author rendy
 */
public class Node {
    int data ;
    Node prev;
    Node next;
    
    Node (Node prev, int data, Node next ){
        this.prev= prev;
        this.data= data;
        this.next= next;
    }
}
