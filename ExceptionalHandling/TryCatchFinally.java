public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int[] arr = new int[1];
            arr[2] = 20;
        }
        catch (ArrayIndexOutOfBoundsException ariexcep){
            System.out.println(ariexcep);
            System.out.println("Array should not be out of bound.");
        }
        finally{
            System.out.println("This is finally block.");
        }
        System.out.println("Out of Try, Catch and Finally.");
    }
