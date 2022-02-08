package com.dhruv;

public class GetBytes {
    public static void main(String[] args) {
        String s = "ABCDabcd";
        byte[] br = s.getBytes();
        for (byte b : br) {
            System.out.println(b);
        }
    }
}
