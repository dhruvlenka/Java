public class BreakInWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=15) {
            if(i==10){
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
