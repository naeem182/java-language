
package foorloop;

import java.util.Scanner;

public class print1ton {

    
    public static void main(String[] args)
    {
      int n,i;
      System.out.print("Enter last digit:");
      Scanner inp=new Scanner(System.in);
      n=inp.nextInt();
        System.out.printf("print 1 t0 %d is below\n:",n);
          
      for(i=1;i<n;i++)
      {
          System.out.printf("\t %d",i);
          
      }
      
       
      }

    
    
    
}
