import java.util.Scanner;

public class FloatToDouble {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float num = Sc.nextFloat();

        double d = num;   // automatic conversion

        System.out.println("Float value: " + num);
        System.out.println("Converted to double: " + d);
        
        Sc.close();
    }
}
