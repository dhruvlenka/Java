// Using break with nested loop
public class BreakNested {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Pass " + i + ": ");
            for(int j = 1; j < 100; j++)
            {
                if(j == 10)
                break;
                System.out.println(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop complete.");
    }
    
}
