/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aisyaah;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
import java.util.Stack;
public class FilmMain {
      public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner (System.in);
        Stack<StackFilm> sf = new Stack<StackFilm>();
        int angka = 0;
            do{
            System.out.println("====================================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("====================================");
            System.out.println("1. Input judul Film");
            System.out.println("2. Hapus Data teratas");
            System.out.println("3. Cek Judul Film teratas");
            System.out.println("4. Info Semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("===================================");
            System.out.println("Pilih: ");
            angka=sc.nextInt();

            switch (angka){
                case 1 :
                    System.out.println("ID Film : ");
                    int idFilm = in.nextInt();
                    System.out.println("Judul Film : ");
                    String judul = sc.next();
                    System.out.println("Tahun Tayang : ");
                    int tahun = in.nextInt();
                    System.out.println("Director : ");
                    String director = sc.next();
                    System.out.println();
                    StackFilm fml = new StackFilm(idFilm, judul, tahun, director);
                    sf.push(fml);
                    break;
                case 2 :
                    System.out.println(sf.pop());
                    break;
                case 3 :
                    System.out.println(sf.peek());
                    break;
                case 4 :
                    for(int i= 0; i< sf.size(); i++){
                        System.out.println(sf.get(i));
                    }
                    break;
            }
        }while (angka < 5 );
    }
}
