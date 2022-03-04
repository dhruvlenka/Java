import java.util.Scanner;
public class ReverseInput {
   public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number = ");
      int num = input.nextInt();
     
       while(num > 0) {
         int rem = num % 10; // int rem = num / 10;
         num /= 10;
         System.out.print(rem);
       }
   }
}
