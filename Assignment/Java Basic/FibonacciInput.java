import java.util.Scanner;
public class FibonacciInput {
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Term = ");
        int term = input.nextInt(); //  5 

        for(int i = 1; i<=term; i++){
            
            System.out.print(a + " "); //0
            c = a + b;  // c = 1 // c = 2 // c = 3 ...
            a = b;     // a = 1 // a = 2 // ....
            b = c;    // b =  1 // b = 2 // b = 3 ....
        }
         
    }
}
