import java.util.Scanner;
public class ASCIIAToZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Character = ");
        char x = input.next().charAt(0);

        System.out.print("Enter Character = ");
        char y = input.next().charAt(0);

        for(char i = 'A'; i<='Z'; i++) {
          System.out.println("The ASCII Value of " + i + " is "+ (int)i); 
        }
    }
}
