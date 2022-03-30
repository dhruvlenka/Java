public class ParameterizedConstructor {
      public static void main(String[] args) {
          data student1 = new data(2020, 51, "LNCABTCSE000", "NAME", 89.6f, 'A');
          System.out.println(student1.year);
          System.out.println(student1.roll);
          System.out.println(student1.enrollment);
          System.out.println(student1.name);
          System.out.println(student1.marks);
          System.out.println(student1.sec);
    
   }   
}
class data {
    int year;
    int roll;
    String enrollment;
    String name;
    float marks;
    char sec;

    data(int year, int roll, String enrollment, String name, float marks, char sec){
       this.year = year;
       this.roll = roll;
       this.enrollment = enrollment;
       this.name = name;
       this.marks = marks;
       this.sec = sec;
    }
    
}
