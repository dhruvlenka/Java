public class SmallestNumInArray {
    public static void main(String[] args) {
        int[] table = {12,14,16,18,20,2,4,6,8,10,};
        int min  = table[0];
        for (int a: table){
            if(a < min){
                min = a;
            }
        }
        System.out.println("Smallest Number in Array = " + min);
    }
}
