import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Numbers = ");
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
       System.out.println(list);
    }
}
