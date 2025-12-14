import java.util.Scanner;

public class SumOfNnaturalNum{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till you want to add");
        int n = input.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum = sum + i;
            i++;
        }
        
        System.out.println(sum);
    }
}