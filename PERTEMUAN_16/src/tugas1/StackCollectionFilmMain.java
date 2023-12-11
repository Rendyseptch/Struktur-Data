/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author rendy
 */
public class StackCollectionFilmMain {
     public static void main (String []args){
        Scanner input =new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
              Stack<StackCollectionFilm> scf = new Stack<>();
                int   pilih= 0;
                
            do{
                System.out.println("************************************");
                System.out.println("Data Film Layar Lebar Sepanjang Masa");
                System.out.println("************************************");
                System.out.println("1. Input Judul Film");
                System.out.println("2. Hapus Data Film Teratas");
                System.out.println("3. Cek Judul Film Teratas");
                System.out.println("4. Info Semmuua Judul Film");
                System.out.println("5. Keluar");
                System.out.println("************************************");
                System.out.println("Pilihan : ");
                pilih= input.nextInt();
                
                if(pilih==1){
                    System.out.println("Id Film     : ");
                    int idFilm= input.nextInt();
                    System.out.println("Judul Film  : ");
                    String judul= sc.nextLine();
                    System.out.println("Tahun Tayang: ");
                    int tahun= input.nextInt();
                    System.out.println("Director    : ");
                    String director= sc.nextLine();
                    
                    StackCollectionFilm mm = new StackCollectionFilm(idFilm, judul, tahun, director);
                    scf.push(mm);
                    
                }else if(pilih==2){
                System.out.println(scf.pop());
                }else if(pilih==3){
                System.out.println(scf.peek());
                }else if(pilih == 4){   
                for (int i=0; i< scf.size(); i++){
                System.out.println(scf.get(i));
                }
             }
    }while(pilih< 5 && pilih>0);
    }
}


