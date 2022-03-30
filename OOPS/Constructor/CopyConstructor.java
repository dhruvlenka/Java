public class CopyConstructor {
    public static void main(String[] args) {  
        employee emp1 = new employee(133, "Dhruv Lenka","IT");
        System.out.println(emp1.id + " " + emp1.name + " " + emp1.department);
        employee emp2 = new employee(emp1);
        System.out.println(emp2.id + " "+ emp2.name + " " + emp2.department);
    }
}
class employee {
    int id;
    String name;
    String department;
 
    employee(int i, String s, String s2){
        id = i;
        name  = s;
        department = s2;
    
    }
    employee(employee emp) {
        id = emp.id;
        name = emp.name;
        department = emp.department;
    }

void display() {
    System.out.println(id + name + department);
}
}
