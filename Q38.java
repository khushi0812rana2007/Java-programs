class Q38 {
    public static void main(String[] args) {
    class BankAccount {
    int balance = 0;
    void deposit(int amount) {
    balance = balance + amount;
    }
    void withdraw(int amount) {
    balance = balance - amount;
    }
    void show() {
    System.out.println(balance);
    }
} BankAccount account = new BankAccount();
    account.deposit(100);
    account.withdraw(30);
    account.show();
    }
}
