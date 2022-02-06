// Program on Accessing elements in Java
public class AccessArrayElements {
    public static void main(String[] args) {
        int[] table = {11,22,33,44,55,66,77,88,99,110}; // Creating Array

        /*
        System.out.println("First Element = " + table[0]); // For accessing array elements
        System.out.println("Seond Element = " + table[1]);
        System.out.println("Third Element = " + table[2]);
        System.out.println("Forth Element = " + table[3]);
        System.out.println("Fifth Element = " + table[4]);
        System.out.println("Six Element = " + table[5]);
        System.out.println("Seventh Element = " + table[6]);
        System.out.println("Eighth Element = " + table[7]);
        System.out.println("Nineth Element = " + table[8]);
        System.out.println("Tenth Element = " + table[9]);
        */
        
        for(int i = 0; i<table.length;i++) // For printing all elements in table array.
        System.out.println(table[i]);

        System.out.println("The size of the array = "+ table.length); // For priting size of the array
    }
}
