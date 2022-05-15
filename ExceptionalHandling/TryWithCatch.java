 public class TryWithCatFin {
    public static void main(String[] args) {
        try {
            int marks = 50/0;
        }
        catch (ArithmeticException ariexe){
            System.out.println(ariexe);
        }
        System.out.println("Exception Handled");
    }
}
