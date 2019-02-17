
package javabasic;

/**
 *
 * @author salah
 */
public class MathClassDemo {
    public static void main(String[] args) {
        int x=70;
        int y=-40;
       int max=Math.max(x, y);
        System.out.println("Maxumum= "+max);
         int min=Math.min(x, y);
        System.out.println("Minimum= "+min);
        int absolute=Math.abs(y);
        System.out.println("Absolute of y= "+absolute);
        double power=Math.pow(x, y);
        System.out.println("x to power y= "+power);
        double pi=Math.PI;
        System.out.println("Pi= "+pi);
        int round=Math.round(8.5f);
        System.out.println("8.5 round= "+round);
        
    }
    
}
