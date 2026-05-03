class OverloadingExmp {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
class TestOverloadingExmpDemo {
    public static void main(String[] args) {
        OverloadingExmp m = new OverloadingExmp();
        System.out.println("Sum = " + m.add(10, 20));
        System.out.println("Sum = " + m.add(10, 20, 30));
    }
}
