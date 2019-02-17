
package javabasic;
import java.util.Scanner;

/**
 *
 * @author salah
 */
public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter your 1st no:");
        int number1=input.nextInt();
        System.out.print("Enter your 2nd number");
        int number2=input.nextInt();
        int result=number1+number2;
        System.out.println("the sum is"+result);
        
    }
    
}
