/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg13.Prakt2;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class BinaryTreeArrayMain {
    public static void  main (String[]args){
         BinaryTreeArray bta= new BinaryTreeArray();
//         int [] data={6,4,8,3,5,7,9,0,0,0};
//         int idxLast=6;
//         bta.populateData(data, idxLast);
//         bta.traverseInOrder(0);
//         
         
//tugas nomer 5
Scanner sc = new Scanner(System.in);
            System.out.println("masukkan jumlah data");
            int dt = sc.nextInt();
            
            int [] data= new int [dt];
            for (int i= 0; i<data.length; i++){
            System.out.print(" Masukkan Data : ");
            int angka= sc.nextInt();
             bta.add(angka, i);
             bta.update(data);
            }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("tampilan index :");
        int idxLast= sc.nextInt();
        bta.populateData(data, idxLast);
        System.out.println("InOrder :");
        bta.traverseInOrder(0);
        
        System.out.println(" ");
        System.out.println("PreOrder");
        bta.traversePreOrder(0);
        System.out.println(" ");
        System.out.println("PostOrder");
        bta.traversePostOrder(0);
        System.out.println(" ");
        }
    }

    
