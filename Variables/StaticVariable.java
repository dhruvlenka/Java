public class StaticVariable {
    static String add = "Addition of A and B = ";
    static String subs = "Substraction of A and B = ";

    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        int c = a+b;
        int d = a-b;

        System.out.println(add+c);
        System.out.println(subs+d);
    }
}
