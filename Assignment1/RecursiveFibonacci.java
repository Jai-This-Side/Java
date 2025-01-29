package Assignment1;
import java.util.Scanner;
public class RecursiveFibonacci {
	public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return 1; 
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci (recursive) of " + n + " is: " + fibonacciRecursive(n));
        scanner.close();
    }
}
