package com.dhruv;

public class IndexLastIndex {
    public static void main(String[] args) {
        String quote = "Prove them wrong";
        /*
        Working of
        IndexOf: L -> R
        LastIndexOf: L <--  R
         */
        System.out.println(quote.indexOf("them"));
        System.out.println(quote.lastIndexOf("them"));
    }
}
