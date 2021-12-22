public class OROperator {
    public static void main(String[] args) {
        int x = 40;  
        int y = 10;  
        int z = 20;  
        System.out.println(x>y||x<z);  //true || true = true  
        System.out.println(x>y|x<z);  //true | true = true  
        System.out.println(x>y||x++<z);  //true || true = true  
        System.out.println(x);  //40 because second condition is not checked  
        System.out.println(x>y|x++<z);  //true | true = true  
        System.out.println(x);  //41 because second condition is checked  
    }
}
