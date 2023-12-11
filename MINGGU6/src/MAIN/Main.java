/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

/**
 *
 * @author Name
 */
public class Main {
    public static void main( String[]args){
           int a[]={ 15, 10, 7, 22, 5 };
           
           Sort urut= new Sort(a, a.length);
           System.out.println("Data Sebelum urut");
               urut.tampilData();
               urut.bubbleSort(); 
               urut.selectionSort();
            System.out.println("data sesudah urut  Bubble Sort (asc) ");
               urut.tampilData();
            System.out.println("data sesudah urut  Selection Sort(asc) ");
               urut.tampilData();
      }
    
}
