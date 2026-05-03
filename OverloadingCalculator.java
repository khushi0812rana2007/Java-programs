class OverloadingCalculator {
    int add(int a, int b) { return a + b; }
}
class AdvancedCalculator extends OverloadingCalculator {
    int add(int a, int b, int c) { return a + b + c; }
}
class TestOverloading {
    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Sum = " + ac.add(10, 20, 30));
    }
}
