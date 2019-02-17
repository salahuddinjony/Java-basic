
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class SeriseProgram2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n,sum=0;
        System.out.print("Enter your last number: ");
        n=input.nextDouble();
        for (double i = 1.5; i<=n; i++) {
            sum=sum+i;
            System.out.print(i+" ");
            
        }
        System.out.println(" ");
        System.out.println("The sum is= "+sum);
        
    }
    
    
}
