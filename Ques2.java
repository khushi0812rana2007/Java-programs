 class Ques2 {
    public static void main(String[] args) {
        int total = 10;
           for (int i = 1; i <= 50; i++) {
              if (i < 10) {
                total = total + 1;
            } else {
                total = total + 2;
            }
        }
       System.out.println(total);
    }
}
