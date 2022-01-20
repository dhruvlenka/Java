public class FunctionOverloading {
    public static void main(String[] args) {
        func(21);
        func("Dhruv Lenka");
    }
    static void func(int x) {
        System.out.println(x);
    }
    static void func(String name) {
        System.out.println(name);
    }
}
