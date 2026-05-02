class Locker {
    private boolean isOpen;
    private int pin;

    Locker() {
        isOpen = false;
        pin = 1234; // default PIN
    }

    void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }
    }

    void checkPin(int enteredPin) {
        if (enteredPin == pin) {
            isOpen = true;
            System.out.println("Correct PIN! Locker opened.");
        } else {
            isOpen = false;
            System.out.println("Incorrect PIN! Locker remains closed.");
        }
    }
}
