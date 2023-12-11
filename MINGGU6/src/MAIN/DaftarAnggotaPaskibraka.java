package MAIN;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendy
 */
public class DaftarAnggotaPaskibraka {
         Paskibraka listpp[] = new Paskibraka[10];
    int a;
    
    void tambah(Paskibraka b){
        if(a<listpp.length){
            listpp[a] = b;
            a++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(Paskibraka m : listpp){
            m.tampilIdentitas();
            System.out.println("-----------------------------------");
        }
    }
    
    void sorting(){
        for(int i=0; i<listpp.length-1; i++){
            for(int j=1; j<listpp.length-i; j++){
                if(listpp[j].tinggi > listpp[j-1].tinggi){
                    
                    
                    //swipe
                    Paskibraka tmp = listpp[j];
                    listpp[j] = listpp[j-1];
                    listpp[j-1] = tmp;
                }
            }
        }
    }
    
    //modifikasi pada no 2
    void lolos(){
        int tinggi = 0;
        for(int i=1; i<listpp.length ;i++){
            if(listpp[i].tinggi >= 170){
                 listpp[i].tampilIdentitas();
            }
        }
    }
    
}
        
        
    

