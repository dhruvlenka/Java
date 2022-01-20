import java.time.Year;

public class Swap {
    public static void main(String[] args) {
        int x = 21;
        int y = 19;
       
        x = x + y; // x becomes 40
        y = x - y; // y becomes 21
        x = x - y; // x becomes 19
    
        System.out.println(x);
        System.out.println(y);

    }
}
