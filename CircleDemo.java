
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class CircleDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double radius,area;
        radius=10;
        System.out.print("Please enter your radius: ");
        radius=input.nextDouble();
        area= 3.1416 * radius * radius;
        System.out.println("Your cirlce area is= "+area);
        
        
    }
    
}
