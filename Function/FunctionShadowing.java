public class FunctionShadowing {
    static int x = 21; //this code will be shadowed at line 7
    public static void main(String[] args) {
      //  System.out.println(x);
        int x; // the variable of 90 is shadowed by this variable
        x = 19;
        System.out.println(x);
        //fun();

    }
    static void fun() {  
        System.out.print(x);
    }
}
