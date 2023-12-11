/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_16.pertanyaan;

import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rendy
 */

public class contohListMain {
    public static void main (String[] args){
    List l= new ArrayList();
    l.add(1);
    l.add(2);
    l.add(3);
//    l.add("cireng");
    System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size()-1));
    
    l.add(4);
    l.remove(0);
    System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size()-1));
    //praktikum1 no 3
    LinkedList<String> names = new LinkedList<>();
    names.add("Noureen");
    names.add("Akhleema");
    names.add("Shannum");
    names.add("Uwais");
    names.add("Al- Qarni");
    //praktikum1 no 4
    names.push("Mei-Mei");
    System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
            names.getFirst(), names.size(), names.getLast());
    System.out.println("Names: " + names.toString());
    
    System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
            names.get(0), names.size(), names.get(names.size()-1));
    names.set(0, "My Kid");
    System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
            names.get(0), names.size(), names.get(names.size()-1));
    System.out.println("Names: " + names.toString());
         
    
   }
}
