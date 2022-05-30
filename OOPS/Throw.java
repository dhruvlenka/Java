package com.dhruvlenka;

public class Throw {
    public static void voteAge(int age){
        if (age < 18){
            throw new ArithmeticException("Person is not eligible for vote");
        } else {
            System.out.println("Person is eligible for vote.");
        }
    }
    public static void main(String[] args) {
         voteAge(5);
        System.out.println("You can vote, Thanks");
    }
}
