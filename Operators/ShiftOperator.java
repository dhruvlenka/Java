public class ShiftOperator {
    public static void main(String[] args) {
        // For Postive Number, >> and >>> works same(gives positive)
        System.out.println(18>>2);
        System.out.println(18>>>2);
       // For Negative Numebr, >> and >>> do not works same
       // For Negative Numebr, >>> changes parity bit (MSB) to 0.
        System.out.println(-18>>2);
        System.out.println(-18>>>2);
    }
}
