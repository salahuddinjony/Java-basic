
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class IfElseElseif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter any integer Number= ");
        num=input.nextInt();
        if(num>0){
            System.out.println("This is positive Number");
        }
        else if(num<0){
            System.out.println("This is negative Number");
        }
        else{
            System.out.println("Equal to Zero ");
        }
        
        
    }
    
}
