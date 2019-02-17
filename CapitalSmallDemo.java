
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class CapitalSmallDemo {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter any Charecter: ");
        ch=input.next() .charAt(0);
        if(ch>='a' && ch<='z'){//a-z
            System.out.println("Small letter");
     }
        else if(ch>='A' && ch<='Z'){ //A-Z
            System.out.println("Capital letter");
     }
        else{
            System.out.println("This is not letter");
        }
        
     }
}
