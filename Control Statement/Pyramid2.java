public class Pyramid2 {
     public static void main(String[] args) {
        int pyrmid = 10;
        for(int i = 1; i<= pyrmid; i++) {
            for (int j = pyrmid; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
