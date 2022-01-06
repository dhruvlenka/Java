import java.util.Scanner;
public class PalindromeNumberInput {
    public static void main(String[] args) {
        int y, z = 0, rem;  // variable

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Numeber = ");
        int x = input.nextInt(); //Input 121
        y = x; // y = 121
      
        //Loop
        while(x>0)  // 121 > 0 = True  // 12 > 0 = TRUE // 1 > 0 = TRUE
        {
            rem = x % 10; // For Reminder, 121 % 10 = 1, rem = 1, rem = 12%10 = 2, rem = 1 % 10 = 1 
            z = (z * 10) + rem; // (0 * 1) + 1 = 1, (1*10) + 2 = 12, (12*10) + 1 = 121
            x = x / 10;  // n = 12, n = 1, n = 0; 
        }
        if (y == z) {
            System.out.println(y + " Palindrome Numeber");
            } else {
                System.out.println(" Not a Palindrome Number");
        }
    }
}
