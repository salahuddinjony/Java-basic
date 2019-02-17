
package javabesic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class PetternDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter line number: ");
        num=input.nextInt();
        
        for(int row=num;row>=1;row--){
            
            for(int col=1;col<=row;col++){
                
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    
}
