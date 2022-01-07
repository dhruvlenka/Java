import java.util.Scanner;
public class ASCIIInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character = ");
        char c = input.next().charAt(0); //D

        int ascii  = c;
        System.out.println(ascii);
        
    }
}
