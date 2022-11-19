import java.util.Scanner;
public class JavaIFElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int N = input.nextInt();

        /*
        N is odd, print "Weird"
        N is even, inclusive range 2 to 5 "Not Weird"
        N is even, inclusive range 6 to 20 "Weird"
        N is even and greater than 20 print "Not Weird"
         */
        if (N % 2 == 0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N>=6 && N<=20){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N>=20){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
