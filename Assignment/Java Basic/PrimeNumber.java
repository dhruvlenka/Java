import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = input.nextInt();  //7

        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 2) {
            System.out.println(num + " Prime Number");
        } else {
            System.out.println(num+ " Not a prime number");
        }
    
    }
}
