import java.util.Scanner;                                               
public class MultiplicationTable {                                      
    public static void main(String[] args) {                            
                                                                        
        Scanner input = new Scanner(System.in);                         
        System.out.print("Enter a number for Table = ");                
        int x = input.nextInt();                                        
                                                                        
        for(int i=1;i<=10;i++){                                         
            System.out.println(x + " x " + i + " = " + x*i );           
        }                                                               
                                                                        
    }                                                                   
}          

//OUTPUT
Enter a number for Table = 50
50 x 1 = 50
50 x 2 = 100
50 x 3 = 150
50 x 4 = 200
50 x 5 = 250
50 x 6 = 300
50 x 7 = 350
50 x 8 = 400
50 x 9 = 450
50 x 10 = 500
