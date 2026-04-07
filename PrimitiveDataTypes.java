import java.util.Scanner;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integerValue = sc.nextInt();
        System.out.println("You entered the integer: " + integerValue);

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered the double: " + doubleValue);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("You entered the boolean: " + booleanValue);

        sc.close();
    }
}