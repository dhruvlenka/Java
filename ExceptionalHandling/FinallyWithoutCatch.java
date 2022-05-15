public class FinallyWithoutCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        finally {
            System.out.println("Finally Statement is executed");
        }
    }
}
/*
Finally without catch will show exception
 */
