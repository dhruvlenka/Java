//Sorting array in Descending Order
import java.util.Arrays;
import java.util.Collections;

public class ArraySortDes {
    public static void main(String[] args) {
        Integer [] arr = {28,79,78,12,15,0,-7,-8,2,3};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(arr));

    }
}
