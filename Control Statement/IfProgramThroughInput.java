import java.util.Scanner;
public class IfProgramThroughInput {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("How much you want to donate to Army = ");
        int  donation = input.nextInt();
        System.out.println("You entered = "+ donation);
        if(donation >= 100)
        System.out.println("You can donate to Army, Thank You");
    }    
}
