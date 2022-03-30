public class ClaObj {
    public static void main(String[] args) {
        data empl1 = new data();
        System.out.println(empl1.name);
        System.out.println(empl1.enrollmentNo);
        System.out.println(empl1.roll);
        System.out.println(empl1.year);
        System.out.println(empl1.sec);
        data empl2 = new data("DhruvLenka", "LNCATBTCSE051", 51, 'A');
        System.out.println(empl2.name);
        System.out.println(empl2.enrollmentNo);
        System.out.println(empl2.roll);
        System.out.println(empl2.year);
        System.out.println(empl2.sec);
    }
}
class data {
    String name = "VIKASH KUMAR LENKA";
    String enrollmentNo = "LNCABTCSE051";
    int roll = 51;
    int year = 2020;
    char sec = 'A';

    data(){   //default constructor
 
    }

    data(String name, String enrollmentNo, int roll, char sec){
      this.name = name;
      this.enrollmentNo = enrollmentNo;
      this.roll = roll;
      this.sec = sec;

    }
}
