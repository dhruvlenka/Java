package hashmaps;
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        /*
         HashMap<Key, Value> var = new HashMap<>();
         HashMap<DataType, DataType> var = new HashMap<>();
         */

        HashMap<String, String> login = new HashMap<>();
        //Inserting through .put
        login.put("lenkadhruv@gmail.com", "Dhruv@2022");
        login.put("CQK015039", "Lenka2022");
        login.put("DhruvLenka","Dhruv2022@");
        System.out.println("HashMap = " + login);

        //for getting the 'value' from key we use .get
        System.out.println(login.get("CQK015039"));

        //for deleting 'key' and 'value'
        login.remove("lenkadhruv@gmail.com");
        System.out.println(login);

        //for checking 'key' is present in the HashMap or not
        //It will give the output in the boolean form.
        System.out.println(login.containsKey("DhruvLenka"));
        if (login.containsKey("JacKRyan")){
            System.out.println("Is in the HashMap");
        } else {
            System.out.println("Not in the HashMap");
        }
       //for checking 'value' is present in the HashMap or not
        //It will give the output in the boolean form.
        System.out.println(login.containsValue("Dhruv2022@"));

       //this will get false value because written 'value' is not present in the HashMap.
        System.out.println(login.containsValue("Dhruv2022"));

        //.getValue
        System.out.println(login.get("lenkadhruv@gmail.com"));

    }
}
