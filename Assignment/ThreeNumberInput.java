// Program on finding the largest number in given 3 numbers through user input
import java.util.Scanner;
public class ThreeNumberGreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int number1 = in.nextInt();

        System.out.print("Enter second number = ");
        int number2 = in.nextInt();

        System.out.print("Enter third number = ");
        int number3 = in.nextInt();

        if(number1 > number2)
         if(number1 > number3)
         System.out.println("The greatest number entered by you = " + number1);

         if(number2 > number1)
          if(number2 > number3)
          System.out.println("The gretest number entered by you = " + number2);
          
         if(number3 > number1)
          if(number3 > number2)
          System.out.println("The greatest number entered by you = "+ number3); 
    }
}
