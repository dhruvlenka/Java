package collectionFramework;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
          /*
         HashMap<Key, Value> var = new HashMap<>();
         HashMap<DataType, DataType> var = new HashMap<>();
         */

        //.put(): add elements
        HashMap<Integer, String> nameRoll = new HashMap<>();
        nameRoll.put(18, " Ayush Kumar Pathak");
        nameRoll.put(24, " Harshit Raj");
        nameRoll.put(51, " VIKASH KUMAR LENKA" );
        nameRoll.put(60, " Gaurav Singh");
        nameRoll.put(15, " Vivek");
        System.out.println("HashMap: " + nameRoll);

        //.size()
        System.out.println("Size of the HashMap: "+ nameRoll.size());

        //.containsKey()
        System.out.println(nameRoll.containsKey(51));

        //.containsValue()
        System.out.println(nameRoll.containsValue(" VIKASH KUMAR LENKA"));

        //.isEmpty()
        System.out.println(nameRoll.isEmpty());

        //.get(): "access" method to get value
        String name = nameRoll.get(51);
        System.out.println("Value: "+ name);

        //.replace
       nameRoll.replace(15,"Animesh");
       System.out.println("After replace: " + nameRoll);

       //.remove
        nameRoll.remove(60);
        System.out.println("After removal: " + nameRoll);
        System.out.println();

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

        System.out.println(login.containsKey("DhruvLenka"));
        if (login.containsKey("JacKRyan")){
            System.out.println("Is in the HashMap");
        } else {
            System.out.println("Not in the HashMap");
        }

        System.out.println(login.containsValue("Dhruv2022@")); //true
        System.out.println(login.containsValue("Dhruv2022")); //false
        System.out.println();

        HashMap<String, String> login2 = new HashMap<>();
        login2.put("lenkadhruv@gmail.com", "Dhruv@2022");
        login2.put("CQK015039", "Lenka2022");
        login2.put("DhruvLenka","Dhruv2022@");
        System.out.println("HashMap = " + login2);

        //iteration through Keys
        System.out.println("Keys: ");
        for (String key: login2.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println();
        //iteration through values
        System.out.println("Values: ");
        for(String value: login2.values()){
            System.out.print(value + ", ");
        }
        System.out.println();

        //iteration through key/values
        System.out.println("Key and Values: ");
        for (Map.Entry<String, String> entry : login2.entrySet()){
            System.out.print(entry + ", ");
        }
        System.out.println();
        System.out.println();

        //Creating HashMap from Tree Map
        //TreeMap
        TreeMap<Integer,String> prizeProduct = new TreeMap<>();
        prizeProduct.put(29999,"iPad 8th Gen");
        prizeProduct.put(8000,"Apple Pencil");
        prizeProduct.put(40000,"iPhone 12 Mini");
        prizeProduct.put(2500,"Apple Airtag");
        System.out.println("Tree Map: "+ prizeProduct);

        //Creating HashMap from TreeMap
        HashMap<Integer,String> prizeProduct2 = new HashMap<>(prizeProduct);
        prizeProduct2.put(171000,"Macbook Pro M1 14inch");
        System.out.println("HashMap: " + prizeProduct2);
    }
}
