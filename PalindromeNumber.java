import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        int num, reversedNum=0;
        System.out.println("Enter a number to check if it is a Palindrome Number or not");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int OrginialNumber = num;

        while(num!=0){
            int j = num%10;
            reversedNum = reversedNum*10+j;
            num = num/10;
        }

        if(reversedNum == OrginialNumber){
            System.out.println("it is a palindrome number");
        }
        else{
        System.out.println("Not a palindrome number");
        }
    }
}