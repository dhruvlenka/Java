import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        int temp, rem, count = 0;
        Scanner input = new Scanner(System.in); //For Input
        System.out.print("Enter a Number = ");
        int num = input.nextInt();
        temp = num; //Value Storing in temp var for practical basics

        while (num > 0){
            rem = num % 10;
            count = count * 10 + rem;
            num = num / 10;
        }
        if(temp == count){
            System.out.print(temp + " is Palindrome Number");
        } else {
            System.out.print(temp + " is not a Palindrome Number");
        }
  }
