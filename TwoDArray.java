import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("You entered the following integers:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();
    }
}