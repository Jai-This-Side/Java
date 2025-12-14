package Assignment1;
import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } 
        else if (bmi > 25) {
            System.out.println("You are overweight.");
        } 
        else {
            System.out.println("You have an average weight.");
        }

        scanner.close();
    }
}