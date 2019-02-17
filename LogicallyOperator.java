
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class LogicallyOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter any Charecter: ");
        ch=input.next() .charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    
}
