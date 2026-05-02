class Shape { void area(){ System.out.println("Generic area"); } }
class Circle extends Shape { void area(){ System.out.println("Circle area"); } }
public class PolyDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
