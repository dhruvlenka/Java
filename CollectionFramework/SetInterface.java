package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        //Implementation of Set Interface using HashSet Class
        Set<String> denzelMovies = new HashSet<>();
        //.add: adding elements
        denzelMovies.add("The Book of Eli");
        denzelMovies.add("The Equalizer");
        denzelMovies.add("The Equalizer 2");
        System.out.println(denzelMovies);

        //.addAll: union
        Set<String> denzelMovies2 = new HashSet<>();
        denzelMovies2.add("Man on Fire");
        denzelMovies2.add("American Gangster");
        System.out.println(denzelMovies2);
        denzelMovies2.addAll(denzelMovies);
        //If you print this directly, means in print parameter, it will give boolean value.
        System.out.println(denzelMovies2);

        //.remove
        Set<String> rem = new HashSet<>();
        rem.add("Apple Macbook Air");
        rem.add("Apple iPad 8th Gen");
        rem.add("Apple iPhone 12 mini");
        rem.add("Apple Pencil");
        rem.add("Apple AirTag");
        rem.add("Apple Macbook Pro M1");
        System.out.println(rem.remove("Apple Macbook Air"));

        //.isEmpty
        Set<String> denzelMovies3 = new HashSet<>();
        System.out.println(denzelMovies.isEmpty());
        System.out.println(denzelMovies2.isEmpty());
        System.out.println(denzelMovies3.isEmpty());

        //.equals
        Set<Integer> a = new HashSet<>();
        a.add(22);
        Set<Integer> b = new HashSet<>();
        b.add(22);
        System.out.println(a.equals(b)); //true

        //.contains
        Set<String> team = new HashSet<>();
        team.add("Deepak");
        team.add("Dhruv");
        team.add("Daranath");
        team.add("Chandan");
        team.add("Manish");
        team.add("Sagar");
        team.add("Randhir");
        System.out.println(team.contains("Dhruv")); //true
        System.out.println(team.contains("Amit")); //false

        //.containAll: subset
        Set<String> team2 = new HashSet<>();
        team2.add("Manish");
        team2.add("Chandan");
        team2.add("Dhruv");
        team2.add("Deepak");
        System.out.println(team.containsAll(team2)); //true

        //.retainAll: intersection
        System.out.println(team.removeAll(team2));

        //.size
        Set<Integer> ages = new HashSet<>();
        ages.add(18);
        ages.add(22);
        ages.add(25);
        ages.add(28);
        ages.add(30);
        System.out.println(ages.size());
        System.out.println(ages);

        //.clear
        Set<Float> sgpa = new HashSet<>();
        sgpa.add(8.44f);
        sgpa.add(9.13f);
        sgpa.add(9.20f);
        sgpa.add(8.47f);
        sgpa.add(8.00f);
        System.out.println(sgpa.size());
        sgpa.clear();
        System.out.println(sgpa);


    }
}
