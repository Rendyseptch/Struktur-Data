/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu.pkg7.tugas.Tugas2;

/**
 *
 * @author rendy
 */
public class tugas2_ {
     tugas2 data[] = new tugas2[5];
    int ba;

    void tambah(tugas2 m){
        if(ba<data.length){
            data[ba]=m;
            ba++;
        }
    }

    void Tampil(){
        for(tugas2 m:data){
            m.tampilData(); 
        }
    }

    void tertinggi(){
        for(tugas2 m:data){
            if(m.total>=245){
                m.tampilData();
            }
        }
    }
    void insertion(){
        for(int i=1; i<=data.length-1; i++){
            tugas2 temp=data[i];
            int j=i-1;
            while(j>=0 && data[j].total<temp.total){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
       }
    }
}

