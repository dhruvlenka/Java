// Writing a program of Array
public class Array {
    public static void main(String[] args) {
        /*
        int [] data; 
        data = new int[5]; // declaration and instantiation in Two line
        */
        int[] data = new int[5]; // declaration and instantiation in One Line
        data[0] = 1; //initialization
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;
        data[4] = 5;
        
    
        for(int a: data) //For Each Loop
        {
            System.out.println(a);
        }

        /*    
         for(int i=0; i<data.length;i++)   //For Loop
          System.out.println(data[i]);
        */
         
    }
}

