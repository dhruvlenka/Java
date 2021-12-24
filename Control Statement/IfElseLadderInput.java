import java.util.Scanner;
public class LadderInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = input.nextInt();
        if(number > 0) {
            System.out.println("Your entered number " + number + " is Postive");
        }
        else if(number < 0){
            System.out.println("Your entered number "+ number + " is Negative");
        } else{
            System.out.println("Your entered number "+ number + " is Zero");
        }
    }
}
