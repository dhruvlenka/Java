package collectionFramework;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> colFrameList = new TreeSet<>();
        //colFrameList: Collection Framework List
        //.add
        colFrameList.add("Array List");
        colFrameList.add("Linked List");
        colFrameList.add("Vector");
        colFrameList.add("Stack");
        System.out.println("Collection Frameworks List: " + colFrameList);

        TreeSet<String> colFrameQueue = new TreeSet<>();
        colFrameQueue.add("Priority Queue");
        colFrameQueue.add("Deque");
        colFrameQueue.add("Array DeQueue");
        System.out.println("Collection Framework Queue: " + colFrameQueue);

        TreeSet<String> colFrameSet = new TreeSet<>();
        colFrameSet.add("HashSet");
        colFrameSet.add("Sorted List");
        colFrameSet.add("Tree Set");
        System.out.println("Collection Framework Set: " + colFrameSet);

        //TreeSet follows ascending order
        TreeSet<String> asc = new TreeSet<>();
        asc.add("Dog");
        asc.add("Cat");
        asc.add("Lion");
        asc.add("Rose");
        asc.add("Elephant");
        asc.add("Cow");
        asc.add("Apple");
        System.out.println(asc); //will print in ascending order

        //TreeSet uses binary tree to speed up finding, adding and removing elements.
        //.remove
        asc.remove("Cow");
        System.out.println(asc); //cow will remove

        //.contains
        System.out.println(asc.contains("Elephant")); //true

        //.size
        System.out.println(asc.size()); //6

        //first() and .pollFirst()
        System.out.println(asc.first()); //Apple
        System.out.println(asc.pollFirst());

        //last() and .pollLast()
        System.out.println(asc.last()); //Rose
        System.out.println(asc.pollLast());

        //.isEmpty()
        System.out.println(asc.isEmpty()); //false

        //.clone()
        TreeSet<String> CLONE = (TreeSet<String>) asc.clone();
        System.out.println(CLONE);
        System.out.println();

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(8);
        numbers.add(16);
        numbers.add(24);
        numbers.add(32);
        numbers.add(40);
        System.out.println("Half Table: "+ numbers);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(48);
        numbers2.add(54);
        numbers2.add(64);
        numbers2.add(72);
        numbers2.add(80);
        System.out.println("Another Half Table: "+ numbers2);

        numbers.addAll(numbers2);
        System.out.println("New Tree Set or Table: " + numbers);

        //.iterator(): accessing elements
        //calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("Tree Set after Iteration: ");
        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();

        TreeSet<String> CLEAR = new TreeSet<>();
        CLEAR.add("Apple Macbook Pro M1");
        CLEAR.add("Apple iPAD");
        CLEAR.add("Apple iPhone");
        CLEAR.add("Apple Pencil");
        CLEAR.add("Apple Airpods");
        CLEAR.add("Apple AirTag");
        CLEAR.clear();
        System.out.println(CLEAR);
    }
}
