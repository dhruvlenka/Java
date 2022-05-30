package com.dhruvlenka;
class addition{
  static  int add(int a, int b){
        return a+b;
    }
  static  int add(int a, int b, int c){
        return a+b+c;
    }
}
class multiplication{
    static int subs (int a, int b){
        return a*b;
    }
    static   int subs (int a, int b, int c){
        return a*b*c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Addition = " + addition.add(11,12));
        System.out.println("Addition = " + addition.add(12,14,15));
        System.out.println("Multiplication = " + multiplication.subs(5,4));
        System.out.println("Multiplication = " + multiplication.subs(18,17,21));
    }

}
