
package three.input.max;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ThreeInputMax {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Enter three num:");
                Scanner inp=new Scanner(System.in);
        double m,n,o,max;
        m=inp.nextDouble();
        n=inp.nextDouble();
        o=inp.nextDouble();
        max=(m>n)?(m>o?m:o):(n>o?n:o);
 
        
        System.out.printf("larg number among "+m +", "+n +" and " +o + " is :"  +max);
        
    }
    
}
