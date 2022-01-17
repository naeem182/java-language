
package sourceuserinpt;
import java.util.Scanner;
public class Sourceuserinpt {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("enter two num:");
        
        int a=input.nextInt();
        int b=input.nextInt();
            classuserinput obj=new  classuserinput(a,b);
            obj.printofab();
                
    }
    
}
