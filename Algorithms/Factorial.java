package com.dhruvlenka;
//Factorial of a Number Using Recursion
public class Factorial {
    static int factorial(int num){
        // termination condition
      if(num == 0){
          return 1;
      } else {
          // recursive call
          return num * factorial(num-1);
      }
    }
    public static void main(String[] args) {
     int number, result; // var declaration
     number = 20; //assigning value
     result = factorial(number);
     System.out.println("Factorial of " + number + " = " + result);
    }
}
