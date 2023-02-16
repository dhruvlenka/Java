package collectionFramework;
import java.util.Collection;
import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
     HashSet<String> fifthSemSub = new HashSet<>();
     //.add
     fifthSemSub.add("Cloud Computing");
     fifthSemSub.add("Computer Networks");
     fifthSemSub.add("Machine Learning");
     fifthSemSub.add("Software Project Management");
     fifthSemSub.add("Compiler Design");
        System.out.println(fifthSemSub);
        for(String s: fifthSemSub){
            System.out.print(s + " ");
        }
        System.out.println();

        //.remove
        fifthSemSub.remove("Compiler Design");
        System.out.println(fifthSemSub);

        //.size
        System.out.println(fifthSemSub.size());

        //.contains
        System.out.println(fifthSemSub.contains("Cloud Computing"));

        //.clone
        HashSet<String> cl = (HashSet<String>) fifthSemSub.clone();
        System.out.println(cl);

        //.isEmpty()
        System.out.println(fifthSemSub.isEmpty());

        //.clear
       fifthSemSub.clear();
        System.out.println(fifthSemSub);

        HashSet<Integer> contain = new HashSet<>();
        contain.add(18);
        contain.add(24);
        contain.add(28);
        contain.add(32);
        contain.add(40);

        HashSet<Integer> contain2 = new HashSet<>();
        contain2.add(18);
        contain2.add(28);
        contain2.add(24);
        contain2.add(40);
        contain2.add(32);

        //.containsAll: Subset
        System.out.println(contain.containsAll(contain2));

        //.addAll: Union
        System.out.println(contain.addAll(contain2));

        //.retainAll: Intersection
        System.out.println(contain.retainAll(contain2));

        //.removeAll: Difference
        System.out.println(contain.removeAll(contain2));

    }
}
