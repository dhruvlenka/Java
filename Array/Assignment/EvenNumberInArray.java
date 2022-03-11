public class EvenNumberInArray {
    public static void main(String[] args) {

        int[] even = {1,2,3,4,5,6,7,8,9,10,12};
        System.out.print("Even number elements in given Array = ");
        for (int i = 1; i < even.length; i += 2) {
            System.out.print(even[i] + " ");


        }
    }
}
