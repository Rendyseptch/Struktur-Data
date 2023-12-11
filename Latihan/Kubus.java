/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ACER
 */
public class Kubus {
    public int sisi;
   
       public int hitungVolumeKubus()
        {
       return sisi* sisi* sisi; 
        }
    
    public int hitungLuasPermukaanKubus()
        {
     return 6*sisi;  
        } 
}

