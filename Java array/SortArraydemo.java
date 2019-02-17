
package arraydemo;

import java.util.Arrays;

/**
 *
 * @author salah
 */
public class SortArraydemo {
    public static void main(String[] args) {
        int []num={-1,4,7,5,3};
        Arrays.sort(num);
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i]+" ");
            
        }
        System.out.println("");
         for (int i =4; i >=0; i--) {
            System.out.print(num[i]+" ");
            
        }
        
        
        
        
    }
    
}
