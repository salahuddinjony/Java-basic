
package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double f,c;
        System.out.print("Enter farenheit: ");
        f=input.nextDouble();
        c=1.8*(f-32);
        System.out.println("Celsius= "+c);
        
        
    }
}
