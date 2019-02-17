
package CopyConstructor;

/**
 *
 * @author salah
 */
public class TeacherDemoCopyCon {
    String name,gender,sub;
    int roll;
    
    TeacherDemoCopyCon(){
        System.out.println("No value");
    }
    TeacherDemoCopyCon(String n,String m){
        name=n;
        gender=m;
    }
    TeacherDemoCopyCon(String n,String m,String g){
        name=n;
        gender=m;
        sub=g;
    }
    TeacherDemoCopyCon(String n,String m,String g,int r){
        name=n;
        gender=m;
        sub=g;
        roll=r;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Subject : "+sub);
        System.out.println("Roll : "+roll);
    }
    
    
}
