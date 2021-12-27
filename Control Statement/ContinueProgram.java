public class ConituneProgram {
    public static void main(String[] args) {
        int i = 1;
        while(i<15) {
            if(i==10){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
