//Private variable declaration
//These private class can be accessed by public method.
class Encapsulations {
    private String name;
    private int roll;
    private int enrollment;
    private int classAttend;
    //getter setter method
    //get
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public int getEnrollment(){
        return enrollment;
    }
    public int getClassAttend(){
        return classAttend;
    }
    //set
    public void setName(String name) {
        this.name = name;
        /*
         You can also Write like this
         public void SetName(String ne) {
         name = ne;
         */
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public void setClassAttend(int classAttend) {
        this.classAttend = classAttend;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Encapsulations std1 = new Encapsulations();
        // Calling setter method for Assigning values to variables
        std1.setName("Dhruv Lenka");
        std1.setRoll(47);
        std1.setEnrollment(51);
        std1.setClassAttend(80);
        // Calling getter method for Printing the values
        System.out.println("Name = " + std1.getName());
        System.out.println("Roll = " + std1.getRoll());
        System.out.println("Enrollment = " + std1.getEnrollment());
        System.out.println("Class Attended = " + std1.getClassAttend());
    }
}
