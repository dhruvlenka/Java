// Finding Armstrong number using while loop
import java.util.Scanner;
public class ArmstrongProgram {
    public static void main(String[] args) {
        int temp, rem, sum = 0;  // variables

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = input.nextInt(); // Input 153
        temp = num;              // temp = 153

        while(num > 0) // 153 > 0 True, 15 > 0 True, 5 > 0 True
        {
        rem = num % 10;           // 153%10 = 3_rem = 3, 15%10 = 5_rem = 5, 1%10 = 1
        sum = sum + rem*rem*rem; // sum = 27, sum = 125, sum = 1, Total = 27 + 125 + 1 = 153
        num = num / 10;  // 153/10 = 15_rem = 3_num = 15, 15/10 = 1_rem = 5_num = 5, , 1/10 = 1_rem = 0_num = 0;
        }
        if(temp == sum) {
            System.out.println(temp + " is Armstrong Number");
        } else {
            System.out.println(temp + " is not Armstrong Numebr");
        }
        input.close();
    }
}
