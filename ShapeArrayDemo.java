class Shape {
    void draw() { System.out.println("Generic Shape"); }
}
class Circle extends Shape {
    void draw() { System.out.println("Circle"); }
}
class Square extends Shape {
    void draw() { System.out.println("Square"); }
}
public class ShapeArrayDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Shape() };
        for(Shape s : shapes) {
            s.draw();
        }
    }
}
