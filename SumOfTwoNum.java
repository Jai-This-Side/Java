import java.util.Scanner;
public class SumOfTwoNum{
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();

        int num3 = num1+num2;

        System.out.println("Sum of two Numbers is: "+ num3);
    }
}