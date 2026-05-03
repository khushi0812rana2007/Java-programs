class OverridingExmp {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends OverridingExmp {
    void sound() { System.out.println("Dog barks"); }
}
class TestOverriding {
    public static void main(String[] args) {
        OverridingExmp a = new Dog();
        a.sound();
    }
}
