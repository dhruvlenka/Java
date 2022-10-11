package hashmaps;
import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> login = new HashMap<>();
        login.put("lenkadhruv@gmail.com", "Dhruv@2022");
        login.put("CQK015039", "Lenka2022");
        login.put("DhruvLenka","Dhruv2022@");
        System.out.println("HashMap = " + login);

        //Size of the HashMap
        System.out.println("Size of the HashMap = " + login.size());
        //removing 'key' and 'value'
        login.remove("CQK015039");
        System.out.println("Size of the HashMap = " + login.size());
        //adding
        login.put("JackRyan", "Ryan2022@#");
        System.out.println("New HashMap = " + login);

        //iteration
        Set<String> keys = login.keySet();
        for(String s: keys){
            System.out.println(s);
        }
    }
}
