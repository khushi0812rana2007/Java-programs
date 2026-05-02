public interface ConstantInterface {
    int players = 11; // by default public static final
    void play();
}
class Football implements ConstantInterface {
    public void play() { System.out.println("Football with " + players + " players"); }
}
class ConstantInterfaceDemo {
    public static void main(String[] args) {
        Football f = new Football();
        f.play();
    }
}
