
package javabesic;

/**
 *
 * @author salah
 */
public class LargeNumber {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=200;
        c=39;
       int large=Math.max(a, b);
      int large2= Math.max(large, c);
        System.out.println("Large number is "+large2);
        
    }
    
}
