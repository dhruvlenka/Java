package com.dhruv;

public class StringReverse2 {
    public static void main(String[] args) {
      String name = "Welcome Mr Anderson";
      int length = name.length();
      System.out.println(name);

        System.out.println("Reverse of : " + name);

        for (int i=0; i < length; i++)
        {
            System.out.print(name.charAt(name.length()-i-1));
        }







    }
}
