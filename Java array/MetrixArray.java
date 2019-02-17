
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class MetrixArray {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [][]A=new int[2][3];
    int [][]B=new int[2][3];
    //input 
    System.out.println("Enter an elements");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                 A[row][col]=input.nextInt();
                
                
            }
            
        }//input
         System.out.println("Enter an elements");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ",row,col);
                 B[row][col]=input.nextInt();
                
                
            }
            
        }//output
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" A = "+A[row][col]);
                
            }
            System.out.println(" ");
            
        }//output
        System.out.println("");
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" B = "+B[row][col]);
                
            }
             System.out.println(" ");
                 
             }
        }
         
}
    
    
