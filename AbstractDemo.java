abstract class Shape { abstract void draw(); }
class AbstractDemo {
    class Square extends Shape { void draw(){ System.out.println("Drawing Square"); } }
    public static void main(String[] args) {
        AbstractDemo outer = new AbstractDemo();
        Shape s = outer.new Square();
        s.draw();
    }
}
