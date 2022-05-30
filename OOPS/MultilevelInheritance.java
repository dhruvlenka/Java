package com.dhruvlenka;

class emp {
    void se() {
        System.out.println("Software Engineering");
    }
}
class pvtDA extends emp{
   void analyst() {
       System.out.println("Data Analyst");
   }
}
class dataScientist extends pvtDA {
    void scientist() {
        System.out.println("Data Scientist");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        dataScientist job = new dataScientist();
        job.se();
        job.analyst();
        job.scientist();
    }
}
