
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class ThreeeNumberOf_large {
    public static void main(String[] args) {
         
         int a,b,c;
         System.out.print("Enter your 1st number= ");
         a=input.nextInt();
         System.out.print("Enter your 2st number= ");
         b=input.nextInt();
         System.out.print("Enter your 3rd number= ");
         c=input.nextInt();
       
        if(a>b){
            if(a>c)
                System.out.println("Large number is="+a);
        }
        else if(b>c){
            System.out.println("Large number is="+b);
            
            
        }
        else{
            System.out.println("Large number is= "+c);
        }
    }
    
}
