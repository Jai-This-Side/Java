
import java.util.Scanner;

public class TempratureConversion {

    public static void main(String[] args) {
        int choice;
        float temp, Farenheit, Celsius, Kelvin;
        System.out.println("Press 1 for farenheit to celsius.\nPress 2 for farenheit to kelvin.\nPress 3 for celsius to farenheit.\nPress 4 for Celsius to kelvin.\nPress 5 for kelvin to farenheit.\nPress 6 for kelvin to celsius.");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the temprature in farenheit");
                temp = input.nextFloat();
                Celsius = (temp - 32)*5/9;
                System.out.printf("%.2f degree farenheit is %.2f degree in celsius%n", temp, Celsius);
                break;

            case 2:
                System.out.println("Enter the temprature in farenheit");
                temp = input.nextFloat();
                Kelvin = (float) ((temp - 32)*5/9 + 273.15);
                System.out.printf("%.2f degree Farenheit is %.2f in kelvin%n", temp, Kelvin);
                break;

            case 3:
                System.out.println("Enter the temprature in celsius");
                temp = input.nextFloat();
                Farenheit = (temp * 9/5) + 32;
                System.out.printf("%.2f degree celsius is %.2f degree in farenheit%n", temp, Farenheit);
                break;

            case 4:
                System.out.println("Enter the temprature in celsius");
                temp = input.nextFloat();
                Kelvin = (float) (temp + 273.15);
                System.out.printf("%.2f degree in celsius is %.2f in kelvin", temp, Kelvin);
                break;

            case 5:
                System.out.println("Enter the temprature in kelvin");
                temp = input.nextFloat();
                Farenheit = (float) ((temp - 273.15)*9/5 + 32);
                System.out.printf("%.2f degree in kelvin is %.2f degree in farenheit", temp, Farenheit);
                break;

            case 6:
                System.out.println("Enter the temprature in kelvin");
                temp = input.nextFloat();
                Celsius = (float) (temp - 273.15);
                System.out.printf("%.2f degree in kelvin is %.2f degree in celsius", temp, Celsius);
                break;

            default:
                System.out.println("Invalid input!");
        }
    }
}
