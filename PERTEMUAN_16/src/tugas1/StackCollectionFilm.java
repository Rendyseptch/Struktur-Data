/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;



/**
 *
 * @author rendy
 */
public class StackCollectionFilm {
    int idFilm;
    String judul;
    int tahun;
    String director;
    
    public StackCollectionFilm(){
        
    }
    
    public StackCollectionFilm(int idFilm ,String judul, int tahun, String director){
        this.idFilm= idFilm;
        this.judul= judul;
        this.tahun= tahun;
        this.director= director;
    }
   
    @Override
    public  String toString(){
        return "Film{ID Film=" + idFilm + ", Judul Film= " + judul +", Tahun Tayang =" + tahun
                + ", Director= " +director + "}";
                
    }
}
 