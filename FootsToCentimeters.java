import java.util.Scanner;

public class FootsToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        double feet = sc.nextDouble();
        double centimeters = feet * 30.48;
        System.out.println(feet + " feet is equal to " + centimeters + " centimeters.");
        sc.close();
    }
}