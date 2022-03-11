// Sorting Array in Ascending Order
import java.util.Arrays;

public class ArraySortAsc {
    public static void main(String[] args) {
        int[] arr = {19,18,17,151,12,13,2,4,6,8,8,10,12};
        Arrays.sort(arr);
        System.out.print("Array sorted in Ascending Order = ");
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
