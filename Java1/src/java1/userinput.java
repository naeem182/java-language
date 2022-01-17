package java1;
import java.util.Scanner;
public class userinput
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        String username;
        System.out.println("Enter username:");
        username=input.nextLine();
System.out.printf("username is: %s",username);
    }
}

