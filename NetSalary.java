package Assignment2;
import java.util.Scanner;

public class NetSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your basic salary");
		float BasicSalary = input.nextFloat();
		
		float HRA = 20*BasicSalary/100;
		float DA = 10*BasicSalary/100;
		float PF = 12*BasicSalary/100;
		float PT = 500;
		
		float NetSalary = (BasicSalary + HRA + DA) - (PF + PT);
		
		System.out.printf("House Rent Allowance is: %.2f", HRA);
		System.out.printf("%nDearness Allowance is: %.2f", DA);
		System.out.printf("%nProvident Fund is: %.2f", PF);
		System.out.printf("%nYour Net Salary is: %.2f", NetSalary);
	}
}
