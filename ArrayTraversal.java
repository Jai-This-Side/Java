import java.util.Scanner;

public class ArrayTraversal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = input.nextInt();

        int[] arr = new int[n];   

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);  // empty array
        }     
    }
}
