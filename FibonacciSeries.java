import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String args[]){
        int FirstNum = 0;
        int SecondNum = 1;
        int NextNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till you need the fibonacci series");
        int num = input.nextInt();

        for(int i=0; i <num; i++){
            System.out.print(FirstNum + " ");
            NextNum = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = NextNum;
        }
    }
}