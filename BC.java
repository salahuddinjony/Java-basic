package javabesic;

/**
 *
 * @author salah
 */
public class BC {

    public static void main(String[] args) {
       int a=10;
       int b=20;
       int sum;
       for(;;){
           if(a<=0 || b<=0){
               System.out.println("Wrong input");
               continue;
           }
           else{
               sum=a+b;
               System.out.println("The sum is= "+sum);
               break;
               
           }
       }
    }

}
