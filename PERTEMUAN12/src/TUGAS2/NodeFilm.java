/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS2;

import pertemuan12.doublelinkedlists.Node;

/**
 *
 * @author rendy
 */
public class NodeFilm {
     int id;
    String judul;
    double rate;
    NodeFilm prev, next;
    
    NodeFilm (NodeFilm prev ,int id, String judul, double rate, NodeFilm next){
        this.prev= prev;
        this.next= next;
        this.id=id;
        this.judul= judul;
        this.rate=rate;
    }
    
}
