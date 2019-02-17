
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class SeriseProgram3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter your last number: ");
        n=input.nextInt();
        for (int i = 1; i<=n; i++) {
            sum=sum+i*i;
            System.out.print(i+"*"+i+" ");
            
        }
        System.out.println(" ");
        System.out.println("The sum is= "+sum);
        
    }
    
    
}
