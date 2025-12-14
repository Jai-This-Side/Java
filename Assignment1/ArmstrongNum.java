package Assignment1;
public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 10,000:");

        for (int num = 1; num <= 10000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
