import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number = ");
        int num = input.nextInt();
   
        if (num % 2 == 0) {
            System.out.print(num + "Even Number");
        } else {
            System.out.print(num+ " is Not Even Number");
        }
    }   
}
