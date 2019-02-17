
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class ReverseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,r,num,temp;
        System.out.print("Enter any number: ");
        num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("The reverse number= "+sum);
        
    }
    
}
