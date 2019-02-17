package oop;

/**
 *
 * @author salah
 */
public class Teacher {

    String name, gender;
    int phone;

    void setInformation(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;

    }

    void displayInformarion() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);

    }

}
