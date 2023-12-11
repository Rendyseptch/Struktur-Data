/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas3.NodeT3;

/**
 *
 * @author rendy
 */
public class T3SLLMain {
    public static void main(String[] args){
        T3SingleLinkedList singLL = new T3SingleLinkedList();

        singLL.push("Bahasa");
        singLL.print();
        singLL.push("Android");
        singLL.print();
        singLL.push("Komputer");
        singLL.print();
        singLL.push("Basis Data");
        singLL.print();
        singLL.push("Matematika");
        singLL.print();
        singLL.push("Algoritma");
        singLL.print();
        singLL.push("Statistika");
        singLL.print();
        singLL.push("Multimedia");
        singLL.print();
        singLL.peek();

    }
}
