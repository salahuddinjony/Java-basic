
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class FarenheitDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double f,c;
        System.out.print("Enter celsius: ");
        c=input.nextDouble();
        f=1.8*c+32;
        System.out.println("farenheit : "+f);
        
        
    }
    
}
