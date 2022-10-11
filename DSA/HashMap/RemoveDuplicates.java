package hashmaps;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static ArrayList<Integer> remove_Duplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Integer, Boolean> arrAy = new HashMap<>();
        for (int j : arr) {
            if (arrAy.containsKey(j)) {
                continue;
            }
            output.add(j);
            arrAy.put(j, true);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,1,5,6,7,8,1,2,3};
        ArrayList<Integer> output = remove_Duplicates(arr);
        System.out.println(output);
    }
}
