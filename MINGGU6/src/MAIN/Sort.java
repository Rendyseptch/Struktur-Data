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
public class Sort {
   public int[] data;
   public  int jumData;
   
   public Sort(int Data[], int jmlData){
       jumData=jmlData;
       data= new int[jmlData];
       for(int i=0; i<jumData; i++){
           data[i]=Data[i];           
       }  
   }
   void bubbleSort(){
       int temp=0;
       for (int i=0; i< jumData-1; i++ ){
            for(int j=1; j<(jumData-i); j++){
                if (data[j]>data[j-1]){
                    temp =data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp; 
                }
             }
         }    
   }
   public void tampilData(){
       for (int i=0; i< jumData; i++ ){
           System.out.print(data[i]+" ");
       }
       System.out.println();    
     }
   void selectionSort (){
       for(int i=0; i<jumData-1;i++){
           int min=i;
           for (int j=i+1;j< jumData; j++){
               if(data[j]< data[min]){
                   min=j;
               }
           }
           int temp=data[i];
           data[i]= data[min];
           data[min]=temp;
           
       }
     }
  }
