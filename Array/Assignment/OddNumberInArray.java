public class OddNumberInArray {
    public static void main(String[] args) {
       int[] even = {2,4,6,1,3,5,7,9,8,10,12};
       /*
       for (int i = 0; i<even.length;i++){
            if (even[i] % 2 != 0){
                System.out.println(even[i]+ " ODD ");
            }
            else {
                System.out.println(even[i]+ " EVEN ");
            }
        }
        */
        for (int j : even) {
            if (j % 2 != 0) {
                System.out.println(j + " ODD ");
            } else {
                System.out.println(j + " EVEN ");
            }
        }
        }
    }
