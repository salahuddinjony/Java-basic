
package MethodOverriddingDemo;

/**
 *
 * @author salah
 */
public class Teacher  extends person{
    String qualifocation;
        void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualifocation : "+qualifocation);
    }
    
}
