 class Q7 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("Second Largest: " + a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("Second Largest: " + b);
        } else {
            System.out.println("Second Largest: " + c);
        }
    } 
}
