/*
public class ArrayProgram {
    public static void mul(int [] arr)
{
    for(int i=0;i<5;i++)
    arr[i]*=i;

}
public static void main (String[] args) {
    int arr[]={1,2,3,4,5};
    mul(arr);
    for(int i=0;i<5;i++)
    {
        System.out.print(arr[i]);
    }
 }
}
*/
/*
    public class ArrayProgram {
    public static void change(int input[]){
    input[0] = 15;
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);
        }
    }
*/
/*
    public class ArrayProgram {
    public static void change(int input[]){
    input = new int[5];
    input[0] = 15;
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);
     }
  }
*/
    public class ArrayProgram{
        public static int[] change(int input[]){
            input = new int[5];
            input[0] = 15;
            return input;
            }
            
            public static void main(String args[]){
                int arr[] = new int[5];
                arr=change(arr);
                System.out.println(arr[0]);
            }   
        
    }
    
