import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		int num;
		System.out.println("Which number's table do you want?");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.println(num +"x"+ i +"="+ num*i);
			i = i+1;
		}
	}
}
