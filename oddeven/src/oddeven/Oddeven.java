/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddeven;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Oddeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double num;
        System.out.printf("Enter a num;");
        num=input.nextDouble();
        if(num%2==0)
            System.out.println(" num is even:"+num);
        else if(num%2==1)//else
            System.out.println("  num is odd:"+num);
        
        
        
    }
    
}
