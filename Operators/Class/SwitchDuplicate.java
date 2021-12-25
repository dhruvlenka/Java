public class SwitchDuplicate {
     public static void main(String[] args){
     switch(50){
     default:
     System.out.println("GoodBye1");
     case 10:
     System.out.println("Hello");
     break;
     case 20:
     System.out.println("Hi"); 
     break;
     case 30:
     System.out.println("Bye");
     break;
     default:  // Gives Error: Duplicate case label
     System.out.println("GoodBye2");
            }
      } 
}
