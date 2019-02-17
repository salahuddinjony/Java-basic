
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class ArmstrongNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,num,temp,sum=0;
        System.out.print("Enter any number: ");
        num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
            
        }
        if(num==sum){
            System.out.println("This is Amrstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
