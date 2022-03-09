package com.dhruv;

public class ReverseArray {
    public static void main(String[] args) {
        // Initializing array
        String[] str = {"D","H","R","U","V"," ", "L","E","N","K","A"} ;

        // Displaying Original Array
        System.out.print("Original String = ");
        for(String org: str){
            System.out.print(org);
        }
        System.out.println();
        // Displaying Reverse Array
        System.out.print("Reversed String = ");
        for(int i = str.length-1; i >= 0; i--){
            System.out.print(str[i]);
        }

    }
}
