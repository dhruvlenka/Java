// Finding Armstrong number through For Loop
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

    int number, temp, total = 0; // var 
    
    Scanner input = new Scanner(System.in);  //input
    System.out.print("Enter 3 digit Armstrong Number = "); //print
    int num = input.nextInt(); // Input = 153
    input.close();

    number = num; // number = 153


    for(;number !=0; number /= 10)
    {
        temp = number % 10;
        total = total + temp*temp*temp;
    }
    if(total == num)
     System.out.println(num + " is Armstrong number");
    else
      System.out.println(num + "is not a Armstrong number");
    
   }     
}
