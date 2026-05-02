public class Main {
    public static void main(String[] args) {
        Locker var1 = new Locker();
        var1.checkStatus();
        var1.checkPin(1111);
        var1.checkPin(1234);
        var1.checkStatus();
    }
}
