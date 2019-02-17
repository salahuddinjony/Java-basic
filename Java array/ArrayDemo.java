
package arraydemo;

/**
 *
 * @author salah
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int [] number=new int[10];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        int sum=number[0]+number[1]+number[3]+number[4];
        int len=number.length;
        System.out.println("The sum = "+sum);
        System.out.println("The index : "+len);

    }
    
}
