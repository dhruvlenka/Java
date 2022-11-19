import java.util.Scanner;
public class oddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = input.nextInt();

        if (n % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Not Odd");
        }
    }
}
