import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = 0;

            while(num != 0) {
                num = num / 10;   // remove last digit
                count++;
            }

            System.out.println("Total digits are: " + count);
        }
    }
}
