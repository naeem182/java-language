
package whictypeofchar;

import java.util.Scanner;
public class calculatorwithjava 
{
   
int addition()
{ int a,b;
    System.out.printf("enter two num:\n");
    Scanner inp=new Scanner(System.in);
    a=inp.nextInt();
    b=inp.nextInt();
    int sum=a+b;
    System.out.printf("addition result=%d\n",sum);

     choice();
    return 0;

}
int subtraction()
{ int c,d;
    System.out.printf("enter two num:\n");
   
    Scanner inp=new Scanner(System.in);
    c=inp.nextInt();
    d=inp.nextInt();

    int sub=c-d;
   System.out.printf("subtraction result=%d\n",sub);
     choice();
    return 0;
    
}
int multiplicatin()
{
    int e,f;
    System.out.printf("enter two num:\n");
    
    Scanner inp=new Scanner(System.in);
    e=inp.nextInt();
    f=inp.nextInt();

    int mul=e*f;
    System.out.printf("multiplication result=%d\n",mul);
     choice();
    return 0;
}
int division()
{ int g,h;
    System.out.printf("enter two num:\n");
    Scanner inp=new Scanner(System.in);
    g=inp.nextInt();
    h=inp.nextInt();
   

    int div=g/h;
    System.out.printf("division result=%d\n",div);
    choice();
    return 0;
}

int choice()
{
   System.out.printf("FOR..............\n");
System.out.printf("\t1.addition\n");
System.out.printf("\t2.subtraction\n");
System.out.printf("\t3.multiplicatin\n");
System.out.printf("\t4.division\n");
System.out.printf("\t5.no calculate\n");
  int calculate;

System.out.printf("enter num that you want to calculate\n");
Scanner inp=new Scanner(System.in);
calculate=inp.nextInt();
switch(calculate)
{
case 1:
    System.out.printf("addition\n");
   calculatorwithjava cal=new calculatorwithjava();
  cal.addition();
   

    break;

case 2:
    System.out.printf("subtraction\n");
    subtraction();


    break;
case 3:
    System.out.printf("multiplicatin\n");
    multiplicatin();

    break;
case 4:
   System.out. printf("division\n");
    division();


    break;
case 5:



    System.out.printf("exit:\n");

    break;
default:
    System.out.printf("wrong input");
    choice();
    break;
}

//getch();

    return 0;

}
public static void main(String[]args)
{ 
    calculatorwithjava cal=new calculatorwithjava();
   cal. choice();

}


    
}
