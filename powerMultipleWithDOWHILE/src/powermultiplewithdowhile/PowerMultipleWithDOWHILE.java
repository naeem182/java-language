/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powermultiplewithdowhile;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PowerMultipleWithDOWHILE {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int i,n;
   
      int sum=1;
      System.out.print("Enter last digit:");
      Scanner inp=new Scanner(System.in);
      n=inp.nextInt();
        System.out.printf("1^5*2^5*3^5.........*%d^5:",n);
          
     i=1;
    do
      {
          sum=(int) (sum*Math.pow(i, 5));
          
           i++;  
      }
      while(i<=n);
        System.out.printf("%d",sum);
 
    }
    
}
