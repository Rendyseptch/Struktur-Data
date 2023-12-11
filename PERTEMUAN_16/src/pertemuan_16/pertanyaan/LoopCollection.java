package pertemuan_16.pertanyaan;


import java.util.Iterator;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class LoopCollection {
    public static void main (String[] args){
    Stack<String> fruits = new Stack<>();
    fruits.push("Banana");
    fruits.add("Orange");
    fruits.add("Watermelon");
    fruits.add("Leci");
    fruits.push("Salak");
    
    for(String fruit: fruits){
        System.out.printf("%s ", fruit);  
    }
    System.out.println("\n"+ fruits.toString());
    while(!fruits.empty()){
        System.out.printf("%s ", fruits.pop());
    }
    fruits.push("Melon");
    //praktikum2 no 5
    fruits.push("Strawberry");
    //praktikum2 no 6
    fruits.push("Mango");
    fruits.push("Guava");
    fruits.push("Avocado");
    System.out.println(" ");
    for (Iterator<String > it= fruits.iterator(); it.hasNext();){
        String fruit= it.next();
        System.out.printf("%s ",fruit);
    }
    System.out.println(" ");
    fruits.stream().forEach(e->{
        System.out.printf("%s ",e);
    });
    System.out.println(" ");
    for (int i=0; i<fruits.size(); i++){
        System.out.printf("%s ", fruits.get(i));
      }
    fruits.sort((String a,String b)->a.compareTo(b));
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Data buah yang telah disorrting");
      for(int i=0; i< fruits.size(); i++){
      System.out.printf("%s  ", fruits.get(i));
      System.out.println(" ");
      }
   }
}
