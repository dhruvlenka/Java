public class OddNumberInArray {
    public static void main(String[] args) {
        int[] odd = {1,2,3,4,5,6,7};
        System.out.println("Odd number elements in given Array = ");
        for (int i = 0; i < odd.length; i += 2){
            System.out.println(odd[i] + " ");
        }
    }
