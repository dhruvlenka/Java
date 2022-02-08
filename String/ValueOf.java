package com.dhruv;

public class ValueOf {
    public static void main(String[] args) {
        int a = 100;
        char c = 'D';
        float f = 68.50F;
        long l = 4500000l;
        double d = 4.55555555;

        String dataTy1 = String.valueOf(a);
        String dataTy2 = String.valueOf(c);
        String dataTy3 = String.valueOf(f);
        String dataTy4 = String.valueOf(l);
        String dataTy5 = String.valueOf(d);
        System.out.println(dataTy1);
        System.out.println(dataTy2);
        System.out.println(dataTy3);
        System.out.println(dataTy4);
        System.out.println(dataTy5);

    }
}
