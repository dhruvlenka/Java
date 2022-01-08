// Writing a program who reverse the number entered by User with the help of for loop.
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {

    int number = 0;
    int reversenumber = 0;
    
    Scanner reverse = new Scanner(System.in);
    System.out.println("Enter numbers = ");
    number = reverse.nextInt();
    
    for( ;number != 0; )
    {
        reversenumber = reversenumber*10;
        reversenumber = reversenumber + number%10;
        number = number/10;
    }
    System.out.println("Reversed number is = "+ reversenumber);
    
    }
    

}
