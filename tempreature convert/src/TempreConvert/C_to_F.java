
package TempreConvert;

import java.util.Scanner;


public class C_to_F 
{
   public static void main(String[] args)
   {
   Scanner input=new Scanner(System.in); 
   double f,c;
   System.out.printf("enter celceus value :");
   c=input.nextDouble();
   f=(9*c/5)+32;
   System.out.printf("farenheit:"+f);
   
   }
 }   
    
