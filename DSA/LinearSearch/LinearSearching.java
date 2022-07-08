
public class LinearSearching {
    public static void main(String[] args) {
        int[] num = {22,18,23,17,19,25,15,14,20,21};
       // int [] num2 = {};
        int target = 19;
        int Ans = LinearSearch(num,target);
        System.out.println(Ans);
        int Ans2 = LinearSearch2(num,target);
        System.out.println(Ans2);
    }
    //Function
    //Line 15 we check array is empty or filled if empty then it will return -1.
    //If filled with similar types of element then program will move forward.
    static int LinearSearch(int[]arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //For Loop
        for (int index = 0; index<= arr.length;index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
    static int LinearSearch2(int[]arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //Enhanced for loop
   for(int element :arr){
       if (element == target){
           return element;
            }
        }
        return -1;
    }
}
