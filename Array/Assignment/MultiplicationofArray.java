public class MultiplicationOfArray {
    public static void main(String[] args) {
        int[] mul = {18,19,21,11,25};

        for (int m: mul){
            System.out.println(m);
        }
        System.out.println("Length = " + mul.length);

        int multiplication = 1;
        for (int multiplyArray : mul){
            multiplication = multiplication * multiplyArray;
        }
        System.out.println(multiplication); // 1975050
    }
}
