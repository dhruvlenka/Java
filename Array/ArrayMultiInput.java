import java.util.Arrays;
import java.util.Scanner;
public class ArrayMultiInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int [3][2];
        System.out.println(arr.length);

        //Input 
        for(int row = 0; row < arr.length; row++){
            // For each column in every row
            for(int col = 0; col < arr[row].length; col++) {
            arr[row][col] = input.nextInt();
            
            }
        }
       for(int[]a: arr){
           System.out.println(Arrays.toString(a));
           input.close();
       }
    }
}
