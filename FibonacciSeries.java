
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=input.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++){
            int fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            
        }
        System.out.println(" ");
    }
    
}
