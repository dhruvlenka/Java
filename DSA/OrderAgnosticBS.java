public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {91,89,75,69,51,49,38,21,11,9,-18,-5};
        int target = -3;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //finding whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //Finding middle element
            int mid = start + (end - start) / 2;
           // Checking mid is equal to target or not, if equal then returning mid
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

