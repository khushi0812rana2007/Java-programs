class Ques7 {
    public static void main(String[] args) {
        int n = 50;   
        int count = 0;
         for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count = count + 1;
            }
        }
         System.out.println(count);
    }
}