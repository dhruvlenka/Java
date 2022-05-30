package com.dhruvlenka;
// Method Overloading by changing the data type
class Arithmetic {
    static int mul(int a, int b){
        return a*b;
    }
    static String str(String a, String  b){
        return a+b;
    }
}
public class MethodOverloadingDaTy {
    public static void main(String[] args) {
        System.out.println("Multiplication = " + Arithmetic.mul(20,50));
        System.out.println("Name = " + Arithmetic.str("Dhruv", "Lenka"));
    }
}
