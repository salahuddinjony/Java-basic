
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class Use_math_ofLargeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
         System.out.print("Enter your 1st number= ");
         a=input.nextInt();
         System.out.print("Enter your 2st number= ");
         b=input.nextInt();
         System.out.print("Enter your 3rd number= ");
         c=input.nextInt();
        int v=Math.max(a,b);
        System.out.println("Large number is="+Math.max(v, c));
    }
    
    
}
