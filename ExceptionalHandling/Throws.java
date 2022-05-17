public class Throws {
    int division(int a, int b) throws ArithmeticException  {
        int aE = a/b;
        return aE;
    }
    public static void main(String[] args) {
     Throws thr = new Throws();
     try{
         System.out.println(thr.division(15,0));
     }
     catch (ArithmeticException AE){
         System.out.println("You shouldn't divide number by zero.");
     }
    }
}
