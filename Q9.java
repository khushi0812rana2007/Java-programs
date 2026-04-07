 class Q9 {
    public static void main(String[] args) {
        int n = 6;

        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("Special");
        } else if (n % 2 == 0) {
            System.out.println("Even");
        } else if (n % 3 == 0) {
            System.out.println("Three");
        } else {
            System.out.println("Normal");
        }
    }
}
