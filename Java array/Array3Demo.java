package arraydemo;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class Array3Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.print("Enter your 5 number: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();

        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];

        }
        System.out.println("The sum is= " + sum);
        double avg;
        System.out.println("Average is: " + sum / num.length);
        double max = num[0];
        double min = num[0];
        for (int i = 1; i < 5; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }

        }
        System.out.println("" + max);
        System.out.println("" + min);
    }

}
