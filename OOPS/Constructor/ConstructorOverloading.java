public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student(51, "LNCABTCSE000", "NAME");
        System.out.println(s1.roll);
        System.out.println(s1.enrollment);
        System.out.println(s1.name);
        System.out.println();
        Student s2 = new Student(01, "LNCABTAIML000", "NAME", 6200003792l);
        System.out.println(s2.roll);
        System.out.println(s2.enrollment);
        System.out.println(s2.name);
        System.out.println(s2.mobNum);        
        
    }
}
class Student {
    int roll;
    String enrollment;
    String name;
    long mobNum;

    Student(int i, String s, String s2){
        roll = i;
        enrollment = s;
        name  = s2;
    }
    Student(int i, String s, String s2, long l) {
        roll = i;
        enrollment = s;
        name  = s2;
        mobNum = l;
    }
}
