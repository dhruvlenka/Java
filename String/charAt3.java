package com.dhruv;
//Counting repeated character by using charAt() method.
public class charAt3 {
    public static void main(String[] args) {
//        String s = "WelcomeMrAnderson";
//        int count = 0;
//        for(int i = 0; i < s.length()-1; i++) {
//            if(s.charAt(i) == 'e'){
//                count++;
//            }
//        }
//        System.out.println("E is repeated = " + count);

        String s = "dhruvdhruvadevrajdevikadhanjaydeepanjali";
        System.out.println(s.length());
        int repeat= 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == 'd'){
                repeat++;
            }
        }
        System.out.println("Repeated Numbers of D = "+ repeat);
    }
}
