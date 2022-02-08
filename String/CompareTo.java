package com.dhruv;

public class CompareTo {
    public static void main(String[] args) {
        String word = "Hii";
        String word2 = "hii";
        String word3 = "Bye";
        String word4 = "Boohoo";
        String word5 = "Hii";
        System.out.println(word.compareTo(word2));// It gives -32
        System.out.println(word.compareTo(word3));// It gives 6
        System.out.println(word.compareTo(word4)); // It gives -15
        System.out.println(word.compareTo(word5)); // It gives 0 because both are equal
    }
}
