package Assignment2;
import java.util.Scanner;

public class SwitchMenu {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a to perform arithmetic operations\nEnter b to check Odd/Even\nEnter c to print multiples\nEnter d to calculate factorial\nEnter e to exit");
			char inp = input.next().charAt(0);
			
			switch(inp) {
				case 'a':
					System.out.println("Enter following operator to perform operation (+, -, *, /)");
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
					
					break;
				
				case 'b':
					System.out.println("Enter the number to check if it is odd or even");
					int num = input.nextInt();
					
					if(num%2 == 0) {
						System.out.println("Even number");
					}
					
					else if(num%2 != 0) {
						System.out.println("Odd number");
					}
					
					else {
						System.out.println("Invalid Input");
					}
					
					break;
					
				case 'c':
					System.out.println("Enter the number to find its multiples");
					int multiple = input.nextInt();
					
					for(int i = 1; i <= 10; i++) {
						System.out.println(multiple +"x"+ i +"="+ multiple*i);
					}
					
					break;
					
				case 'd':
					System.out.println("Enter the number to find it's factorial");
				       int num2 = input.nextInt();
				       int result2 = 1;

				        while(num2 > 0) {
				            result2 = result2 * num2;
				            num2--;
				        }
				        System.out.println(result2);
				        
				        break;
				        
				case 'e':
					System.out.println("Exiting the program.");
					System.exit(0);
			}
		}	
	}
