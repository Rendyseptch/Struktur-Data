/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;



/**
 *
 * @author rendy
 */

import java.util.Scanner;
public class Graph<T> {
    T[] vertex;
    LinkedLists list[];
    boolean isDirected = false;
    
    public Graph(T[] vertex){
        this.vertex=vertex;
        list= new LinkedLists[vertex.length];
        for(int i= 0; i<  vertex.length ; i++){
            list [i] = new LinkedLists();
        }
    }
    public boolean graphType() {
     return isDirected;
 }
    
    void addEdge(int source , int destination){
        //add edge
        list[source].addFirst(destination);
        
        //add back edge (for undirected)
        if (!graphType())list[destination ].addFirst(source);
    }
    
    public void degree (int source ) throws Exception{
        //egree undirected graph 
        System.out.println("degree vertex "+source +"  :  "+list[source].size());
        
        //degree directed graph
                //indDegree
        int k = 0,totalIn=0, totalOut =0 ;
        for (int i=0; i< vertex.length ; i++){
        for (int j=0; j< list [i].size(); j++){
            if(list[i].get(j)==source)
                ++totalIn;
        } 
        totalOut=k;
        }
        System.out.println("Indegree dari vertex "+ source+ "  :  "+ totalIn);
        System.out.println("Outdegree dari vertex "+ source+ "  :  "+ totalOut);
        System.out.println("degree  vertex "+ source+ "  :  "+ (totalIn + totalOut)); 
    }
    public void removeEdge(int source, int destination) throws Exception{
        if(graphType()){
        for (int i =0 ; i< list[source].size() ; i++){
            if(destination==list[source].get(i) ){
                list[source].remove(i);
            }
       }  
      }else {
                for(int i =0 ; i< list[destination].size(); i++){
                    if(source ==list[destination].get(i)){
     }
    }
  }
  }
    public void removeAllEdge(){
        for (int i=0 ; i< vertex.length ; i++){
            list [i].clear();
        }
        System.out.println("Grap berhasil dikosongkan ");
    }
    public void printGraph () throws Exception{
        for (int i= 0; i<vertex.length ; i++ ){
            if (list[i].size()>0){
                System.out.print(" vertex "+ vertex[i]+ "  Terhubung dengan: ");
                for (int j=0 ; j<list[i].size(); j++){
                    System.out.print(vertex[list[i].get (j)]+ " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
    public static void main  (String [] args) throws Exception {
        Scanner input = new Scanner(System.in);
//        Graph graph= new Graph (6);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        graph.removeEdge(1, 2);
//        graph.printGraph();


 System.out.print("Masukkan jumlah vertex : ");
 String [] vertex = new String[input.nextInt()];
 input.nextLine();
 
 for(int i = 0; i < vertex.length; i++){
        System.out.print("Masukkan data vertex ke- " + i + " : ");
 vertex[i] = input.nextLine();
 }
 Graph<String> graph = new Graph<String>(vertex);
 System.out.println("1. Directed");
 System.out.println("2. Unirected");
 System.out.print("Jenis Graph (1/2) : ");
 
 
 graph.isDirected = (input.nextInt() == 1) ? true : 
false; // Settipe dari graph berdasarkan inputan
 System.out.print("Masukkan jumlah edge : ");
 int edges = input.nextInt();
 System.out.println("Masukkan Edge: (from to)");
 for (int i = 0; i < edges; i++) {
 graph.addEdge(input.nextInt(), input.nextInt());
 }
 
 graph.printGraph();
 graph.degree(2);
 input.close();
    }
}
