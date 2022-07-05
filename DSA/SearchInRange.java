//Serching element in the array but in range/
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {20,30,10,12,15,18,19,21,23,25};
        int target = 18;
        int searchDone = find(arr,target,2,5);
        System.out.println(searchDone);
    }
    //Function
    //In this Program array range start from 2 and end into 5
    //If you target the element out of range then it will return -1
    static int find(int[]arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    //SecondWay
    /*
      static int find(int[]arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 2; index <= 5; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
     */
}
