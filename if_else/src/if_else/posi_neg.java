/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

public class posi_neg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("enter a num:");
       Scanner input=new Scanner(System.in); 
       double a;
       a=input.nextDouble();
       if(a>0)
           System.out.printf("num is positive:"+a);
       else if(a<0)
       System.out.printf("num is negative:"+a);
       else
           System.out.printf("num is neutral:"+a);
       
        
        
        
    }
    
}
