package com.dhruv;

import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String befRev, aftRev = "";
        System.out.print("Enter String for reverse = ");
        befRev = input.nextLine();

        int strLength = befRev.length();
        for(int i = strLength-1; i>=0; i--)
            aftRev = aftRev + befRev.charAt(i);
            System.out.println("String after reverse = "+ aftRev);

    }
}
