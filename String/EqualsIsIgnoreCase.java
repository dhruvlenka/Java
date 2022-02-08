package com.dhruv;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String a = "Apple";
        String b = "Bitcoin";
        String c = "duck duck go";
        String d = "Duck Duck Go";
        String e = "bitcoin";
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(b.equalsIgnoreCase(e));
    }
}
