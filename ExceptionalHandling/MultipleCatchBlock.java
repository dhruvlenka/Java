public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[10] = 50/0;
        }
        catch (ArithmeticException ariexcep){
            System.out.println(ariexcep);
            System.out.println("Arithmetic Exception Handled");
        }
        catch (ArrayIndexOutOfBoundsException outOfBoundException) {
            System.out.println(outOfBoundException);
            System.out.println("Array out of bound Exception Handled");
        }
        System.out.println("Multiple Catch Block");
    }

}
/
/*
Note
 At at time only one exception will occur when you execute Multiple Catch Block Code. 
*/
