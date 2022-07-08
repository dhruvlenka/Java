//Binary Search Program
public class BinarySearch {
    public static void main(String[] args) {
         int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
         int target = -18;
         int midValue = binarySearch(arr,target);
        System.out.println(midValue);

    }
    //returning index
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            /*
             this code can be out of the range of integer.
             int mid = (start + end) / 2;
             */
            // Another method to find middle value.
            int mid = start + (end - start) / 2;
            // For array sorted in ascending order
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                    start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
     }
}
