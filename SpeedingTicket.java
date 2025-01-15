package Assignment2;
import java.util.Scanner;

public class SpeedingTicket {
	public static void main(String[] args) {
		
		System.out.println("Enter the speed of the vehichle");
		Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		
		if(speed<60) {
			System.out.println("No Fine");
		}
		
		else if(61 < speed && speed < 80) {
			System.out.println("100 Fine");
		}
		
		else if(81 < speed && speed < 100) {
			System.out.println("250 Fine");
		}
		
		else if(speed > 100) {
			System.out.println("500 Fine");
		}
		
		else {
			System.out.println("Invalid Input");
		}
	}
}