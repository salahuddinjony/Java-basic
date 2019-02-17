
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2,large;
        System.out.print("Enter your first number: ");
        num1=input.nextInt();
        System.out.print("Enter your Second number: ");
        num2=input.nextInt();
        large=(num1>num1)? num1:num2;
        System.out.println("Large number is: "+large);
        
    }
    
}
