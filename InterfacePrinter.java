interface Printer {
    void Printing();
}
class Scanner implements Printer {
    public void Printing() {
        System.out.println("Scanning");
    }
    }
class Fax implements Printer {
    public void Printing() {
        System.out.println("Four Fax");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner();
        Fax f = new Fax();
        s.Printing();
        f.Printing();
    }
}