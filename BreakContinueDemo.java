
package javabesic;

/**
 *
 * @author salah
 */
public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i=i+3) {
            if(i==10){
                break;
            }
            if(i>13){
                break;
            }
            System.out.println(i);
            
        }
    }
    
}
