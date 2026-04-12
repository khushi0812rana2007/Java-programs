class Q34 {
    public static void main(String[] args) {
    class Circle {
    int radius;
    void area() {
    double area = 3.14 * radius * radius;
    System.out.println(area);
    }
}
    Circle c = new Circle();
    c.radius = 5;
    c.area();
    }
}
