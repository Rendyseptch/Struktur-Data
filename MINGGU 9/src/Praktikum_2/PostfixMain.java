/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_2;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class PostfixMain {
   public static void main( String[]args){ 
       Scanner sc= new Scanner (System.in);
       String P,Q;
       System.out.println("Masukkan Ekspresi matematika(infix: ");
       Q= sc.nextLine();
       Q=Q.trim();
       Q= Q+")";
       int total= Q.length();
       
       Postfix post= new Postfix(total);
       P= post.konversi(Q);
       System.out.print("Postfix: "+P);
       
   }
}
