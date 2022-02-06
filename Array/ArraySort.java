//Sort Array List
import java.util.ArrayList;
import java.util.Comparator;
public class ArraySort {
    public static void main(String[] args) {
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
