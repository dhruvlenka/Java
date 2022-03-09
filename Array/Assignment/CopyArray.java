public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {20,21,22,23,24,25}; //Initializing array

       int[] arr2 = new int [arr.length]; // Creating Second array and put the value of first array
       // int[] arr2 = arr;

        int i = 0;
        while(i < arr.length){
            arr2[i] = arr[i];
            i++;
        }
        System.out.print("Elements of first array = ");
        for(int firstArray : arr){
            System.out.print(firstArray + " ");
        }
        System.out.println();
        System.out.print("Elements of second array = ");
        for(int secondArray: arr2)
            System.out.print(secondArray + " ");
    }
