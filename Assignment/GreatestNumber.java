// Finding Greatest Number in Three Number.
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter Number = ");
        int x = input.nextInt();
        
        System.out.print("Enter 2nd Number = ");
        int y = input.nextInt();
 
        System.out.print("Enter 3rd Number = ");
        int z = input.nextInt();

        int max = x;
        if(y > max)  {
           max = y;
        } if (z > max) {
            max = z;
        }
        System.out.println("Greatest Number is = " + max);
        input.close();
    }
}
