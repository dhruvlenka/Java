public class IncOrDec3 {
    public static void main(String[] args) {
        int a = 10; 
        a--; 
        int b=10;
        ++b; 
        System.out.println(a); //9
        System.out.println(b); //11
        System.out.println(a++ + ++a); //20
        System.out.println(b++ + b++); //23
    }
}
