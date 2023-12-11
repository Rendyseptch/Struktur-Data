/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author rendy
 */
public class Node {
     Kendaraan data;
    Node next;

    public Node(Kendaraan data, Node berikutnya){
        this.data = data;
        this.next = berikutnya;
    }
}
