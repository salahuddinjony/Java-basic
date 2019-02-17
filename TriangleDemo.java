
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class TriangleDemo {
    public static void main(String[] args) {
        double base,weight,area;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base: ");
        base=input.nextDouble();
        
        System.out.print("Enter base: ");
        weight=input.nextDouble();
        
        area= 0.5 * base * weight;
        System.out.println("Area= "+area);
        
        
        
    }
    
}
