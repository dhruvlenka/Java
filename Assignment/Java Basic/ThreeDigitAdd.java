public class ThreeDigit {
    public static void main(String[] args) {
        int num = 489;
        int rem  = num % 10;
            num = num / 10;

        int rem2 = num % 10;
            num = num / 10;

        int rem3 = num % 10;
            num = num / 10;

        int sum = rem+rem2+rem3;
         
         System.out.println(sum);
    }
}
