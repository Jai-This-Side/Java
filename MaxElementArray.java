public class MaxElementArray{
    public static void main(String[] args){

        int[] arr = {1,67, 78, 98, 345, 8765, 5};
        int res = Integer.MIN_VALUE; // NEGATIVE INFINITY

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > res) {
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}