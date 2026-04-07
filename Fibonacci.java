import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter number of terms: ");
            int n = Sc.nextInt();

            int a = 0, b = 1;

            System.out.println("Fibonacci Series:");

            for(int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
}
