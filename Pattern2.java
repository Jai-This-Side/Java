import java.util.Scanner;

/* 
1
10
100
1000
10000
100000
1000000
*/

public class Pattern2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till you need the pattern");
        int limit = input.nextInt();

        for(int i = 1, j = 0; j < limit; i = i*10, j++) {
            System.out.println(i);
        }
    }
}
