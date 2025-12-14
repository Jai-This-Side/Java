import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to know if the number is armstrong or not: ");
        int n = scanner.nextInt();
        System.out.println(armst(n));
    }

    public static String armst(int n) {
        int r = 0;
        int count = 0;
        int x = n, y = n;

        while (x != 0) {
            count++;
            x = x / 10;
        }

        while (y != 0) {
            int t = y % 10;
            r = r + (int) Math.pow(t, count);
            y = y / 10;
        }

        if (n == r) {
            return "no. is armstrong";
        } else {
            return "not armstrong";
        }
    }
}