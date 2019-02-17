
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,fact=1;
        System.out.print("Enter your number: ");
        n=input.nextInt();
        for(int i=n;i>=1;i--){
            fact=fact*i;
            
            
        }
        System.out.println("Factorial of "+n+"="+fact);
    }
    
}
