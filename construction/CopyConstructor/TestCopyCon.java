
package CopyConstructor;

/**
 *
 * @author salah
 */
public class TestCopyCon {
    public static void main(String[] args) {
        TeacherDemoCopyCon teacher1=new TeacherDemoCopyCon();
        
        
        System.out.println("");
        
         TeacherDemoCopyCon teacher2=new TeacherDemoCopyCon("Salah uddin","Male");
         teacher2.displayInformation();
         
         System.out.println("");
         
         TeacherDemoCopyCon teacher3=new TeacherDemoCopyCon("Sakin","Male","ICT");
         teacher3.displayInformation();
         
         System.out.println("");
         
         TeacherDemoCopyCon teacher4=new TeacherDemoCopyCon("Arosh","Male","Electronics",0745);
         teacher4.displayInformation();
    }
    
}
