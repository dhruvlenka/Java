public class FunctionOverloading2 {
    public static void main(String[] args) {
        int ans = add(18,19,21);
        System.out.println(ans);
    }
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
