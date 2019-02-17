
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer number: ");
        num=input.nextInt();
        if(num%2==0){
            System.out.println("This number is  Even");
        }
        else{
            System.out.println("This number is Odd");
        }
        
    }
    
}
