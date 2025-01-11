import java.util.Scanner;

public class SearchElementArray{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number to find in the array");
    int num = input.nextInt();

    int[] arr = {1, 2, 34, 55, 66, 77, 98};

    for(int i : arr){
        if(i == num){
            System.out.println("Found");
        }

        else{
            System.out.println("Not Found");
        }
        break;
    }

    }
}