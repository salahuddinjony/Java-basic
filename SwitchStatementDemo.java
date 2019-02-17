 package javabasic;

import java.util.Scanner;
 
/**
 *
 * @author salah
 */
public class SwitchStatementDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Please enter any digit= ");
        digit = input.nextInt();
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seeven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("Fifeteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;

            default:
                System.out.println("Not a single digit");

        }
    }

}
