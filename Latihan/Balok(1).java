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
public class Balok {
    public int panjang;
    public int lebar;   
    public int tinggi;
    
   
    
    public int hitungVolume()
        {
       return panjang* lebar* tinggi; 
        }
    
    public int hitungLuasPermukaan()
        {
     return 2*(panjang*lebar+ panjang*tinggi + lebar*tinggi);  
        }
}
