public class NestedIf {
    public static void main(String[] args) {
        int salary = 500000;
        int wantLoan = 1500000;
        if(salary >= 800000){
            if(wantLoan <= 1500000)
            System.out.println("You are eligible for loan.");
        }
        System.out.println("You are not eligible for loan.");
    }
}
