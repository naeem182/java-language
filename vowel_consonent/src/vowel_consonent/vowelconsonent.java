/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel_consonent;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author user
 */
public class vowelconsonent {
    public static void main(String[]args)
    {
        System.out.print("Enter a charecter:");
        Scanner inp= new Scanner(System.in);
        char ch;
        ch=inp.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 System.out.printf("%c char is vowel :"+ch);
           
        
          else
                 System.out.printf("%c char is consonent :",ch);
   
             
    
    }
    
}
