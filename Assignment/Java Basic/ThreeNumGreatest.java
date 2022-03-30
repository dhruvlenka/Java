import java.util.Scanner;
public class ThreeNumGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int num1  = input.nextInt();

        System.out.print("Enter Second Number = ");
        int num2 = input.nextInt();

        System.out.print("Enter Third Number = ");
        int num3 = input.nextInt();

        if(num1 > num2)
        if(num1 > num3)
        System.out.println(num1 + " is greatest number.");

        if(num2 > num1)
        if(num2 > num3)
        System.out.println(num2 + " is greatest number.");

        if(num3 > num1)
        if(num3 > num2)
        System.out.println(num3 + " is greatest number.");
    }
}
