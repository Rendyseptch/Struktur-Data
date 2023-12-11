/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11.tugas2;



/**
 *
 * @author rendy
 */
public class SLLMainT2 {
   public static void main (String []args){
       SingleLinkedListT2 singLL=new SingleLinkedListT2();
        singLL.print();
        singLL.addFirst('A');
        singLL.print();
        singLL.addLast('E');
        singLL.print();
        singLL.insertAfter('A', 'B');
        singLL.print();
        singLL.insertAt(2, 'C');
        singLL.print();
        singLL.insertAfter('C', 'D');
        singLL.print();

                

   }
}
