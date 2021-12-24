import java.util.Scanner;
public class IfElseThroughInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age = ");
        int age = input.nextInt();
        if (age >=18) 
            System.out.println("You can watch this 18+ video ");
        else 
        System.out.println("Sorry, You can't watch this video.");
    }
}
