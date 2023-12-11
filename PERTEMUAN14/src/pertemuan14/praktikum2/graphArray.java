/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan14.praktikum2;

/**
 *
 * @author rendy
 */
import java.util.Scanner;
public class graphArray <T>{
   private final T[] vertices;
   private final  int[][] twoD_array;
    
    public graphArray(T[] v )
    {
        vertices= v;
        twoD_array= new int [vertices.length + 1][vertices.length+1];
        
    }
    public  void makeEdge(int to, int from, int edge)
    {
        try
        {
            twoD_array[to][from]= edge;
        }
        catch (ArrayIndexOutOfBoundsException index)
            {
                System.out.println("Vertex tidak ada");
            } 
        }
    public int getEdge(int to, int from )
    {
        try
        {
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
    
    public static void main( String args[]){
        int v, e, count = 1,to=0, from=0;
        Scanner sc= new Scanner(System.in);
        graphArray <String >graph;
        try{
            System.out.println("Masukkan jumlah Vertices ");
            v= sc.nextInt();
            System.out.println("Masukkan jumlah Edges ");
            e= sc.nextInt();
            
            
            String[] vertex= new String [v+ 1];//tipe data akan disesuaikan
            sc.nextLine();
            for (int i = 1; i<= v; i++){
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                 vertex[i] = sc.nextLine();
                
            }
            graph= new graphArray<String>(vertex);
            
            System.out.println("Masukkan jumlah Edges: <to> <from> ");
            while (count <=e){
                to =sc.nextInt();
                from= sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
           System.out.println("Array 2D sebagai representasi graph sbb; ");
           System.out.print(" ");
           for(int i=1; i<=v; i++){
               System.out.print(vertex[i]  +" ");
           }
           System.out.println( );
           
        for(int i=1; i<=v; i++){
            System.out.print( vertex[i] +" ");   
           for(int j=1; j<=v; j++){
               System.out.print(graph.getEdge(i, j) +" ");
           }
           System.out.println( );
        }
    }catch (Exception E ){
    System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
}
  sc.close();
}
   
}

