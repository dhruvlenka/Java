public class TypeCasting2 {
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) (a); 
        /*
        The maximum value can be stored in a byte is 0 through 255 = 256
        We write in int a = 257, which exceed the byte value,
        If we convert int to byte then we will get 1 reminder of 257%256 is 1
        */
        System.out.println(b);

    }
}
