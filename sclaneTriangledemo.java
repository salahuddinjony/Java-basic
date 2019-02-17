
package javabasic;

/**
 *
 * @author salah
 */
public class sclaneTriangledemo {
    public static void main(String[] args) {
    double a,b,c;
    a=2;
    b=3;
    c=4;
    double area,s;
    s=(a+b+c)/2;
    area=Math.sqrt(s*(s-b)*(s-b)*(s-c));
        System.out.println(area);
    
        
    }
    
    
}
