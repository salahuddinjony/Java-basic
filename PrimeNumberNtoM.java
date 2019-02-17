package javabasic;

import java.util.Scanner;

/**
 *
 * @author salah
 */
public class PrimeNumberNtoM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, count = 0;
        System.out.print("Enter your first number: ");
        n = input.nextInt();
        System.out.print("Enter your last number: ");
        m = input.nextInt();
        for (int i = n; i <= m; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
            }
            count = 0;

        }    

    }

}
