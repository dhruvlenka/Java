package collectionFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class arrayList {
    public static void main(String[] args) {
        //Example1: .add
        ArrayList<String> names = new ArrayList<>();
        names.add("Gaurav");
        names.add("Dhruv");
        names.add("Animesh");
        names.add("Jayesh");
        names.add("Aditya");
        names.add("Harshit Sharma");
        names.add("Ayush Kumar Pathak");
        names.add("Harshit Raj");
        System.out.println(names);
        for(String name:names){
            System.out.println(name);
        }
        System.out.println();

        //Example: .add
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(25);
        list.add(28);
        list.add(19);
        list.add(18);
        list.add(31);
        System.out.println(list);
        for(int age:list) {
            System.out.println(age);
        }
        System.out.println();

        //Example2: .addAll
        ArrayList<Integer> add1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> add2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        add1.addAll(add2);
        System.out.println("ArrayList after .addAll: "+ add1);
        System.out.println();

        //Example3: .contains
        ArrayList<Integer> list2 = new ArrayList<>(5);
        list2.add(21);
        list2.add(25);
        list2.add(28);
        list2.add(19);
        list2.add(18);
        System.out.println(".contains: " +list2.contains(26));

        //Example4: .containsAll
        ArrayList<Integer> con1 = new ArrayList<>(Arrays.asList(18,24,45,55));
        ArrayList<Integer> con2 = new ArrayList<>(Arrays.asList(55,18,24));
        System.out.println(".containsAll: "+ con1.containsAll(con2)); //true
        System.out.println(".containsAll: "+ con2.contains(con1)); //false
        System.out.println();


        //Example5: .set
        ArrayList<Integer> list3 = new ArrayList<>(5);
        list3.add(21);
        list3.add(25);
        list3.add(28);
        list3.add(19);
        list3.add(18);
        System.out.println("Before .set: " + list3);
        list3.set(1,32); // For changing elements
        System.out.println("After .set: "+ list3);
        System.out.println();

        //Example6 .get
        ArrayList<Integer> selected = new ArrayList<>();
        selected.add(8);
        selected.add(18);
        selected.add(45);
        System.out.println(selected.get(2));
        System.out.println();

        //Example7: .remove
        ArrayList<String> rem = new ArrayList<>(Arrays.asList("MacProIntel","MacAir","MacProSilicon"));
        System.out.println("Before .remove: "+ rem);
        rem.remove("MacProIntel");
        System.out.println("After .remove: " +rem);
        System.out.println();

        //Example8: .removeAll
        ArrayList<String> rem2 = new ArrayList<>(Arrays.asList("MacAirIntel","MacProIntel","MacMiniIntel"));
        System.out.println("Before .removeAll: " + rem2);
        rem2.removeAll(rem2); //all elements are removed
        System.out.println("After .removeAll: " + rem2);
        System.out.println();

        //Example9: .retainAll
        ArrayList<String> intern = new ArrayList<>();
        intern.add("Animesh");
        intern.add("Dhruv");
        intern.add("Vivek");

        ArrayList<String> getJob = new ArrayList<>();
        getJob.add("Animesh");
        getJob.add("Dhruv");

        intern.retainAll(getJob);
        System.out.println("Interns that will get job here is the name: " + intern +
                " You both are the best in the list, Welcome.");
        System.out.println();

        //Example10: toArray
        ArrayList<String> convertToArray = new ArrayList<>();
        convertToArray.add("Iron Man");
        convertToArray.add("Captain America");
        convertToArray.add("Thor");
        convertToArray.add("Hulk");
        convertToArray.add("Natasha Romonoff");
        convertToArray.add("Hawkey");
        System.out.println("ArrayList: " + convertToArray);

        //converting ArrayList to Array: 1st Way
        String[] converted = convertToArray.toArray(new String[0]);
        for (String s : converted){
            System.out.print(s + "," +  " ");
        }

        //2nd way
        String[] str = new String[convertToArray.size()];
        convertToArray.toArray(str);
        for (String s: str){
            System.out.println(s);
        }
        System.out.println();

        //Example11: .size()
        ArrayList<String> remRange = new ArrayList<>();
        remRange.add("Data Types");
        remRange.add("Variables & Constants");
        remRange.add("Operators");
        remRange.add("Conditionals");
        remRange.add("Loops");
        remRange.add("Array");
        remRange.add("String");
        remRange.add("Recursion");
        remRange.add("Searching & Sotring");
        remRange.add("Linked List");
        System.out.println(".size(): " +remRange.size());

        //Example11 .clone()
        ArrayList<String> cl = (ArrayList<String>) remRange.clone();
        System.out.println(cl);

        //Array Sort
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(98);
        marks.add(90);
        marks.add(93);
        marks.add(89);
        marks.add(40);
        System.out.println("Before Sorted = " + marks);

        marks.sort(Comparator.naturalOrder());
        System.out.println("After Natutal Order Sorted = " + marks);
        marks.sort(Comparator.reverseOrder());
        System.out.println("After Reverse Order Sorted = " + marks);
        System.out.println();

        ArrayList<String> name = new ArrayList<>();
        name.add("dhruv");
        name.add("lenka");
        name.add("aman");
        name.add("govind");
        name.add("devraj");
        name.add("rahul");
        name.add("naveen");
        System.out.println("Before Sorted = " + name);

        name.sort(Comparator.naturalOrder());
        System.out.println("After Natutal Order Sorted in String = " + name);
        name.sort(Comparator.reverseOrder());
        System.out.println("After Reverse Order Sorted in String = " + name);

    }
}
