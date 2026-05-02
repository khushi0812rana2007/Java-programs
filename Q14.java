public class Q14 {
     public static void main(String[] args) {
        int n = 100;   
        int product = 1;
        for (; n > 0; n = n + 10) {
            int digit = n % 10;
            product = product * digit;
        }
         System.out.println(product);
    }
}
