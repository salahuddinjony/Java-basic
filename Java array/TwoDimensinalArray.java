
package arraydemo;

/**
 *
 * @author salah
 */
public class TwoDimensinalArray {
    public static void main(String[] args) {
        int[][] number=new int[3][3];
        number[0][0]=10;
        number[0][1]=20;
        number[0][2]=30;
        number[1][0]=40;
        number[1][1]=50;
        number[1][2]=60;
        number[2][0]=70;
        number[2][1]=80;
        number[2][2]=90;
        
        for (int row = 0; row <3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println(" ");
            
        }
    }
    
}
