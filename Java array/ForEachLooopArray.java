
package arraydemo;

/**
 *
 * @author salah
 */
public class ForEachLooopArray {
    public static void main(String[] args) {
        int []num={10,14,15,12,13,11};
        int sum=0;
        for(int x:num){
            sum=sum+x;
            System.out.println(x);
        }
        System.out.println("Sum is: "+sum);
        
    }
    
}
