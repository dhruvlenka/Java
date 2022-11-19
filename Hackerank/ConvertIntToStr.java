import java.util.Scanner;
public class ConvertIntToStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String s = String.valueOf(n);
        if (n >= -100 && n<=100){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
