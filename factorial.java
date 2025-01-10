import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        /*
            6! = 6*5*4*3*2*1
        */

       System.out.println("Enter the number to find it's factorial");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       int result = 1;

        while(num > 0) {
            result = result * num;
            num--;
        }
        System.out.println(result);
    }
}
