// Writing a program in User Defined Function
import java.util.Scanner;
public class Function2 {
    public static void main(String[] args) {
        multiPly(); //Function Call
    }
    // Writing a function or Function Decalration 
    static void multiPly() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number = ");
        int num2 = input.nextInt();
        input.close();

        int multiplication = num1 * num2;
        System.out.println("Multiplication of "+ num1 + " and "+ num2 + " = "+ multiplication);


    }
}
