package Assignment1;
import java.util.Scanner;
public class NonRecursiveFibonacci {
	public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return 1; 
        }
        
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci (non-recursive) of " + n + " is: " + fibonacciNonRecursive(n));

		}
}
