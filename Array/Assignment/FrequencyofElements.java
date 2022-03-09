// Findind duplicate elements using HashSet
import java.util.HashSet;
public class FrequencyofElements {
    public static void main(String[] args) {
      HashSet <Integer>langs;
        langs = new HashSet();
      boolean flag = false;
        for(int rev : arr) {
            if (langs.add(rev) == false){
                System.out.println("Found Duplicate Element = " + rev);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Not found duplicates");
        }
    }
}
