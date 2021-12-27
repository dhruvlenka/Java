// Writing a prorgam for continue stataement;
public class Continue {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            if(i==3 || i==8)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
