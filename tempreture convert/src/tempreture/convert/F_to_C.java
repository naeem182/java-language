
package tempreture.convert;

import java.util.Scanner;


public class F_to_C 
{
   public static void main(String[] args)
   {
   Scanner input=new Scanner(System.in); 
   double f,c;
   System.out.printf("enter farenheit value :");
   f=input.nextDouble();
   c=(5*(f-32))/9;
   System.out.printf("farenheit:"+c);
   
   }
 }   
    
