package Assignment2;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter following operator to perform operation");
		char choice = input.next().charAt(0);
		
		System.out.println("Enter the first number");
		float FirstNum = input.nextFloat();
		
		System.out.println("Enter the second number");
		float SecondNum = input.nextFloat();
		
		float result = 0;
		
		switch(choice) {
		case '+':
			result = FirstNum + SecondNum;
			System.out.printf("Addition of first and second number is: %.2f", result);
			break;
			
		case '-':
			result = FirstNum - SecondNum;
			System.out.printf("Subtraction of first and second number is: %.2f", result);
			break;
			
		case '*':
			result = FirstNum * SecondNum;
			System.out.printf("Multiplication of first and second number is: %.2f", result);
			break;
			
		case '/':
			result = FirstNum / SecondNum;
			System.out.printf("Division of first and second number is: %.2f", result);
			break;
			
		default:
			System.out.println("Invalid Input");
		}
	} 
}
