abstract class Emp {
    String name ;
        int id;
        Emp(String name, int id) {
        this.name = name;
        this.id = id;
        }
    abstract void calculateSalary();
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class FullTimeEmp extends Emp {
    double monthlySalary;

    FullTimeEmp(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    void calculateSalary() {
        System.out.println("Full Time Employee Salary: " + monthlySalary);
    }
}
class PartTimeEmp extends Emp {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmp(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part Time Employee Salary: " + salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {

        FullTimeEmp f1 = new FullTimeEmp("Rahul", 101, 50000);
        f1.displayDetails();
        f1.calculateSalary();

        System.out.println();

        PartTimeEmp p1 = new PartTimeEmp("Aman", 102, 500, 20);
        p1.displayDetails();
        p1.calculateSalary();
    }
}