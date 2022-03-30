public class DefaultConstructor {
    public static void main(String[] args) {
        employee emp1 = new employee();
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.bloodGroup);
        System.out.println(emp1.address);
    }
}

class employee {
    int id = 79;
    String name = "Dhruv";
    int age = 36;
    String bloodGroup = "O+";
    String address = "Bhopal, Madhya Pradesh, India";
}
