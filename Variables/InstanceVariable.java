import java.util.Scanner;

public class InstanceVariable {
    int enrollmentNo = 51; // Instance variable

   public static void main(String[] args){
       /* If we want to access Instance variable, then we have to create
        an instance of Instacne Variable class.
       */
      InstanceVariable instVar = new InstanceVariable();
      /* Here instVar is the name of the object or instance of the 
        InstanceVariable
      */
      System.out.println(instVar.enrollmentNo);
   }    
}
