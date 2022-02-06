import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter College ID = ");
        int collegeId = input.nextInt();
        System.out.println("Enter Depatment = ");
        String department = input.next();
        switch (collegeId) {
            case 1:
                System.out.println("VIKASH KUMAR LENKA");
                break;
            case 2:
                System.out.println("AYUSH KUMAR PATHAK");
                break;
            case 3:
                System.out.println("HARSHIT RAJ");
                break;
            case 4:
                System.out.println("GAURAV SINGH");
                break;
            case 5:
                System.out.println("MANOJ KUMAR");
                switch (department) {
                    case "IT" -> System.out.println("IT Deparment");
                    case "ME" -> System.out.println("MECHANICAL ENGINEERING");
                    default -> System.out.println("No match found");
                }
            default:
                System.out.println("Enter correct College ID");
        }
    }
}
