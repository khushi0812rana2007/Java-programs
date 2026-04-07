import java.util.Scanner;

public class IntToDouble {
    public static void main(String[] args) {

       try(Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        double d = num;   // automatic conversion

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + d);
        }
    }
}
 
