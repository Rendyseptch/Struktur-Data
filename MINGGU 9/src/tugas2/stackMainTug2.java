/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;


/**
 *
 * @author rendy
 */
public class stackMainTug2 {
     public static void main( String[]args){
    
       stack stk = new stack(8);
        stk.push(new Struk (1222111, "28/11/2022",  4, 15000 ));
        stk.push(new Struk (0120302, "19/11/2022",  6, 150000 ));
        stk.push(new Struk (2823803, "11/11/2022", 13, 450000 ));
        stk.push(new Struk (2829191, "23/11/2022",  1, 9000 ));
        stk.push(new Struk (2728281, "20/10/2022",  8, 134000 ));
        stk.push(new Struk (0033211, "15/10/2022",  9, 99000 ));
        stk.push(new Struk (1222332, "11/10/2022",  6, 24000 ));
        stk.push(new Struk (1030202, "09/10/2022",  8, 234000 ));
        
      System.out.println("Struk yang disimpan Dewi");
                stk.print();
                
      System.out.println("Data Struk yang diambil sebanyak 5 :");     
                for (int i =0;i<5; i++)stk.pop();
                stk.print();
             
}
}
