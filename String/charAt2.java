package com.dhruv;
// Printing Even or Odd position by using charAt() method.
public class charAt2 {
    public static void main(String[] args) {
        String s = "WelcomeMrAnderson";
        System.out.println(s);
        System.out.println("Length of S = " + s.length());

        for(int i = 0; i<s.length()-1; i++){
            if(i%2 !=0) {
                System.out.println("Char at " + i + " place " + s.charAt(i)+ " is odd ");
            }
        }
        for(int j = 0; j<s.length()-1; j++){
            if(j%2 == 0)
            {
                //  System.out.println(j);
                System.out.println("Char at "+ j + " place "+ s.charAt(j)+ " is even ");
            }

        }
    }
}
