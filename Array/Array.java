package Arrary;

public class Array {
    public static void main(String[] args) {
        //array start from 0.
        int[] arr = {21,22,28,30,35};
        // finding the length of the array
        System.out.println("Length of the Array = " + arr.length);
        // accessing elements from the array
        System.out.println("First element = " + arr[0]);
        System.out.println("Second element = "+ arr[1]);
        System.out.println("Third element = " + arr[2]);
        System.out.println("Forth element = " + arr[3]);
        System.out.println("Fifth element = " + arr[4]);

        //printing elements of the array using "enhanced for loop"
        for(int i : arr){
            System.out.println(i);
        }
        //printing elements of the array using simple "for loop"
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
