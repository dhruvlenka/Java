public class Reverse {
    public static void main(String[] args) {
      int number = 390146;
      int reverse = 0;
      
      while(number > 0) {
        int rem = number % 10;
        number /= 10;
        reverse = reverse * 10 + rem;
        }
      System.out.println(reverse);
     }
}
