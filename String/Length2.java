package com.dhruv;
// Program for find Whitespaces
public class Length2 {
    public static void main(String[] args) {
        String quote = "There is only one god that is Dead";
        int length = quote.length();
        System.out.println("In String: " + quote);

        quote = quote.replace(" ","");
        int sizeWithoutspace = quote.length();

        int whiteSpacesinString = length - sizeWithoutspace;
        System.out.println("No of Whitespaces are  = " + whiteSpacesinString);
    }
}
