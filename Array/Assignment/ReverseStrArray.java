import java.util.Scanner;

public class ReverseStrArray {
    public static void main(String[] args) {
       String[] strArray = new String[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String Values");

        for (int i = 0; i<strArray.length;i++){
           strArray[i] = sc.nextLine();
        }
        System.out.println("String values entered by you = ");
        for (String j : strArray){
            System.out.println(j);
        }
        System.out.println("Values in Reverse Order = ");
        for (int k = strArray.length-1;k>=0;k--){
            System.out.println(strArray[k]);
        }
    }
}
