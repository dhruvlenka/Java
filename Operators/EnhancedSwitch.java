import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;
        System.out.print("Enter Month = ");
        month = input.nextInt();
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("Feburay");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("Novermber");
            case 12 -> System.out.println("December");
            default -> System.out.println("Entered month doesn't exist.");
        }
        input.close();
    }
}
