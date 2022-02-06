package com.dhruv;

import java.net.SocketTimeoutException;
public class StringEx3 {
    public static void main(String[] args) {
        String name = "Jack Harlow";
        char ch[] = {'J','a','c','k',' ','R','y','a','n'};
        String name2 = new String(ch);
        String name3 = new String("Jack Sparrow");

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
}
