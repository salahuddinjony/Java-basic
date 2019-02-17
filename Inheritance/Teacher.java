package Inheritance;

/**
 *
 * @author salah
 */
public class Teacher extends person {

    String qualificcatoin;

    void display2() { 
        display();
        System.out.println("Qualification= " + qualificcatoin);

    }

}
