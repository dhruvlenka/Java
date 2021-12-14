import java.lang.reflect.Method;

public class LocalInstOrStatic {
    static int staticVariable = 21;
    /* Static variable is independent,
       Anyone can access static variable inside the body,
       And static variable don't need any object.
    */

    int InstanceVariable = 18;
    void method(){
        int localVariable = 15;
    // We can't access Local variable outside any method
    }
    public static void main(String[] args) {
        LocalInstOrStatic instVar = new LocalInstOrStatic();
        System.out.println(instVar.InstanceVariable); // For instance variable
        System.out.println(LocalInstOrStatic.staticVariable);
    }
}
