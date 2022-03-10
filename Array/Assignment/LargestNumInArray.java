public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {9,8,14,15,10,29,39,21,49}; // Initializing Array
        int max = arr[0]; // Assigning Array Index num 0 to max
        for(int i: arr){
            if (i > max){
                max = i;
            }
        }
        System.out.println("Largest Number In Array = " + max);
    }
}
