import java.util.Scanner;
public class ReverseInput {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Numbers for Reverse = ");
        int number = input.nextInt();

        while(number > 0) {
            int rem = number % 10;
            number /=10;
            System.out.print(rem);
        }
    }
}
