package com.dhruv;
import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for term = ");
        int num = input.nextInt();

        for(int i = 1; i < num; i++){
            System.out.println("Number = " + i + " and cube of " + i + " is = " + (i*i*i));
        }
    }
}
