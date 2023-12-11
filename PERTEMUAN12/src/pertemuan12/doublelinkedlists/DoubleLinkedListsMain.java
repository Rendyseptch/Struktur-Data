/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan12.doublelinkedlists;

/**
 *
 * @author rendy
 */
public class DoubleLinkedListsMain {
    public static void main (String[]args) throws Exception{
        DoubleLinkedLists dll= new DoubleLinkedLists();
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.addFirst(3);
//        dll.addLast(4);
//        dll.addFirst(7);
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.add(40, 1);
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.clear();
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        System.out.println("  ");
//        System.out.println("  ");
//
//
//// PRAKTIKUM 2
//        dll.addLast(50);
//        dll.addLast(40);
//        dll.addLast(10);
//        dll.addLast(20);
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.removeFirst();
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.removeLast();
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        dll.remove(1);
//        dll.print();
//        System.out.println("Size : "+dll.size());
//        System.out.println("=========================================");
//        System.out.println("  ");
//        System.out.println("  ");
        
        //PRAKTIKUM 3
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=========================================");
        System.out.println("Data awal pada Linked list adalah : "+dll.getFirst());
        System.out.println("Data akhir pada Linked list adalah : "+dll.getLast());
        System.out.println("Data index ke-1  pada Linked list adalah : "+dll.get(1));
        System.out.println("=========================================");
    }
    
}
