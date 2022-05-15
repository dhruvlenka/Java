//Multiple Catch Block in Java 7
public class Java7MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] arr = new int[7];
            arr[8] = 127;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException ariarr) {
            System.out.println(ariarr);
        }
    }
}
