class Q33 {
    static class Rectangle {
        int length;
        int breadth;
        void area() {
        System.out.println(length * breadth);
        }
    }
    public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    rect.length = 5;
    rect.breadth = 10;
    rect.area();
    }
}
