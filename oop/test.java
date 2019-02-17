package oop;

/**
 *
 * @author salah
 */
public class test {

    public static void main(String[] args) {
        Teacher teacher1;//declare
        teacher1 = new Teacher();//create object
        teacher1.setInformation("salah", "male", 014543);
        teacher1.displayInformarion();

        System.out.println("\n \n");

        Teacher teacher2;//declare
        teacher2 = new Teacher();//create object
        teacher2.setInformation("Rana", "male", 014564543);
        teacher2.displayInformarion();

    }
}
