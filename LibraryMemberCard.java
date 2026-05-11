public class LibraryMemberCard {
    private double fineAmount;
    public LibraryMemberCard() {
        fineAmount = 0.0;
    }
    public void addFine(double amount) {
        fineAmount += amount;
    }
    public void payFine(double amount) {
        fineAmount -= amount;
    }
    public double getFineAmount() {
        return fineAmount;
    }
}
