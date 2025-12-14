public class oddEven{
    public static void main(String[] args) {

        int num = 50;
        String odd = "The number is odd";
        String even = "The number is even";

        String result = num%2 == 0 ? even : odd;    

        System.out.println(result);
    }
}
