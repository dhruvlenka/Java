public class IfElseLadder {
    public static void main(String[] args) {
        int salary = 180000;
        if (salary < 100000) {
            System.out.println("You can get 5 Lakhs Loan.");
        } else if (salary >= 100000 ) {
            System.out.println("You can get 25 Lakhs Loan.");
        } else {
            System.out.println("You can't get Loan.");
        }
    }
}
