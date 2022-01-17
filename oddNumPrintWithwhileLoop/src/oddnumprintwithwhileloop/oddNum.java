/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumprintwithwhileloop;

import java.util.Scanner;


public class oddNum {

  
    public static void main(String[] args) {
       int n,i;
      System.out.print("Enter last digit:");
      Scanner inp=new Scanner(System.in);
      n=inp.nextInt();
        System.out.printf("print 1 t0 %d  odd num is below\n:",n);
          
     i=1;
        while(i<=n)
      {
          if(i%2!=0)
          System.out.printf("\t %d",i);
         i++; 
      }
    }
    
}
