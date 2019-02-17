
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class Series2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int n,result=1;
        System.out.print("Enter last number: ");
        n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            result=result * i*i;
            System.out.print(i+"*"+i+" ");
            
        }
        System.out.println(" ");
        System.out.println("The sum is= "+result);
        
    }
    
}
