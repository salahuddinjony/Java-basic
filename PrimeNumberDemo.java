
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,counter=0;
        System.out.print("Enter any positive int number:  ");
        num=input.nextInt();
        for(int i=2;i<num; i++){
            if(num%i==0){
                counter++;
                break;
                
            }
        }
       if(counter==0){
           System.out.println("This a prime number");
       } 
       else{
           System.out.println("Not a prime number");
       }
    }
    
}
