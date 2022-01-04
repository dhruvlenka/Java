import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        
        int count = 0; 

        Scanner input = new Scanner(System.in);   // Input
        System.out.print("Enter a number = ");
        int n = input.nextInt(); 

        for(int i = 1; i<=n; i++) 
        {
            if(n%i==0) {
                count++;
            }
        }
       if(count == 2){
           System.out.println(n + " Prime Number");
       } else
       {
           System.out.println(n + " Not a Prime Number");
       }
    }
}
