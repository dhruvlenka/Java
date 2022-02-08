package com.dhruv;

public class Contains {
    public static void main(String[] args) {
        String str = "This program is for String contains()";
        System.out.println(str.contains("This")); //True because found
        System.out.println(str.contains("that")); //False because not found
        System.out.println(str.contains("this")); //False because case-sensitive.
    }
}
