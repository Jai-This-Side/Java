package Assignment1;
import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}