//Finding frequency of elements using for loops
public class FrequencyofElements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,5,6,3,4,5,1,9}; // Initializing Array
        //Approach 1
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Found Duplicate Element = " + arr[i]);
                    flag = true;
                }
            }
        }
        if(flag = false) {
            System.out.println("Duplicate element not found");
        }
    }
}
