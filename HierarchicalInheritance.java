class Shape {
    void draw() { System.out.println("Drawing Shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}
class Square extends Shape {
    void draw() { System.out.println("Drawing Square"); }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        new Circle().draw();
        new Square().draw();
    }
}