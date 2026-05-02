class Employee {
    String name;
    Employee(String n){ name = n; }
    void show(){ System.out.println("Employee: " + name); }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        new Employee("Harshita").show();
    }
}
