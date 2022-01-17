
package area1;

import java.util.Scanner;

public class circlearea
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double radius,height;
      System.out.print("enter radius:");
      radius=input.nextDouble();
      double a=(3.1416*radius*radius);
      System.out.println("area of circle:"+a);
  }
  
    
}