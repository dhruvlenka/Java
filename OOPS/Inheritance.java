class Employee {
    String empName = "Harshit Raj";
    int empNum = 212;
}
class SoftwareEng extends Employee {
    int salary = 980000;
}
public class Inheritance {
    public static void main(String[] args) {
        SoftwareEng harshit = new SoftwareEng();
        System.out.println(harshit.empName);
        System.out.println(harshit.empNum);
        System.out.println(harshit.salary);
    }
}
