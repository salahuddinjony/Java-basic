package constructormethoddemo;

/**
 *
 * @author salah
 */
public class ConsDemo {

    String name, gender;
    int phone;
    ConsDemo(){

    }

    ConsDemo(String n,String m,int ph) {
        name = n;
        gender =m ;
        phone = ph;
    }

    void displayInformarion() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);

    }

}
