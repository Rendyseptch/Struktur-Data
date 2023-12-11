/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg13.Prakt2;

/**
 *
 * @author rendy
 */
public class BinaryTreeArray {
    int [] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data= new int [10];
    }
    void populateData(int data[], int idxLast){
        this.data= data;
        this.idxLast= idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart<= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+ " ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int data, int idx){
        this.data[idx]=data;
    }
    void update (int[] data){
        this.data=data;
    }
   void  traversePreOrder( int idxStart){
        if(idxStart<= idxLast){
            if(data[idxStart]==0){
             System.out.print(idxLast+ " ");   
            }else{
             System.out.print(data[idxStart]+ " ");
            }
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }
    }
   void traversePostOrder(int idxStart){
       if(idxStart<= idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            if(data[idxStart]==0){
             System.out.print(idxLast+ " ");   
            }else{
             System.out.print(data[idxStart]+ " ");
            }
        }
     }          
  }
