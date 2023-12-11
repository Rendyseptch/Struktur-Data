/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects.ArrayBalok;

/**
 *
 * @author ACER
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a ,int t)
    {
       alas=a;
       tinggi=t;
    }
   public double hitungLuas()
    {
        return alas*tinggi/2; 
    }
   public double hitungKeliling()
    {
        double sisi;
        sisi= Math.sqrt(Math.pow(tinggi, 2)+ Math.pow((alas/2),2));
        return (int) (sisi + sisi + alas); 
    }
}
