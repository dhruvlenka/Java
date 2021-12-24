import java.util.Scanner;
public class NestedIfInput {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.print("Enter Your age = ");
        int age = sc.nextInt();
        System.out.print("Enter Your weight = ");
        int weight = sc.nextInt();

        if(age >= 18){
            if(weight >= 50)
            System.out.println("You can donate blood.");
        } 
    }
}
