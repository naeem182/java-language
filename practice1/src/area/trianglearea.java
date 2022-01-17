package area;
import java.util.Scanner;
public class trianglearea
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double base,height;
      System.out.print("enter base:");
      base=input.nextDouble();
      System.out.print("enter height:");
      height=input.nextDouble();
      double a=(.5*base*height);
      System.out.println("area of triangle:"+a);
  }
  
    
}