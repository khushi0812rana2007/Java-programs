import java.util.Scanner;
public class Inchestometers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of inches: ");
        double inches = Sc.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is equal to " + meters + " meters.");
        Sc.close();
    }
}