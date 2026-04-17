class Locker {
    private int pin = 1234;
    private boolean isOpen = false;
    public void checkPin(int enterPin) {
        if (enterPin == pin) {
            isOpen = true;
            System.out.println("Locker is opened");
        } else {
            System.out.println("Wrong pin");
        }
    }
    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Locker A = new Locker();
        A.checkStatus();
        A.checkPin(1111);
        A.checkPin(1234);
        A.checkStatus();
    }
}
