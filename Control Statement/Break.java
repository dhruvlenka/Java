// Using break with for loop 
public class Break {
    public static void main(String[] args) {
        for(int i=1; i<100; i++)
        {
            if(i==10)
            break;
            System.out.println("i: "+ i);
        }
            System.out.println("Loop Complete");
    }
}
