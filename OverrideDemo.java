class MOverExmp {
    void display() { System.out.println("Parent class method"); }
}
class Child extends MOverExmp {
    void display() { System.out.println("Child class method"); }
}
public class OverrideDemo {
    public static void main(String[] args) {
        MOverExmp p = new Child();
        p.display();
    }
}