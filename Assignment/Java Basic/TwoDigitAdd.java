// Adding two digits without using Control Statement
public class TwoDigit {
    public static void main(String[] args) {
        int num = 59;

        // int rem = num % 10;
        //     num = num / 10;

        // int rem2 = num % 10;
        //     num = num / 10;

        // int sum = rem+rem2;
        // System.out.println(sum);
        
       int sumAg = num/10 + num % 10; // Shorter
       System.out.println(sumAg);

     // int sumAg2 = num % 10 + num/10; // We can also write this
     // System.out.println(sumAg2);

    }
}
