
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class MultificationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter Multification table number: ");
        num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println("The result of "+num+"X"+i+"="+num*i);
            
        }
        System.out.println("Thank you dear!");
    }
    
}
