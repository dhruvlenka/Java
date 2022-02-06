import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(25);
        list.add(28);
        list.add(19);
        list.add(18);
        list.add(31);
        //System.out.println(list);
        for(int age:list)   // Iterating ArrayList using For-each loop
        System.out.println(age);

        /*
        import java.util.ArrayList;
        public class ArrayListExample {
        public static void main(String[] args) {
   
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(21);
        list.add(25);
        list.add(28);
        list.add(19);
        list.add(18);
        /*
        Contains checks 26 it is in the list or not
        If Yes then it will True,
        and If not then it will give False.
        System.out.println(list.contains(26));
        System.out.println(list);
         */

         /*
         import java.util.ArrayList;
         public class ArrayListExample {
         public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(21);
        list.add(25);
        list.add(28);
        list.add(19);
        list.add(18);
        System.out.println(list);
        list.add(50); // For adding elements
        list.set(1,32); // For changing elements
        list.remove(2); // For removing elements
        System.out.println(list);
    }
}
         */

    }
}
