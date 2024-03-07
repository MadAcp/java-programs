import java.util.Arrays;

public class ContSubArrayWhoseSumEqualsGivenNum {
    public static void main(String[] args) {
        int[] numArray = {42, 15, 12, 8, 6, 11, 1};
        int givenNo = 26;
        //int[] numArray = {2, 4, 1, 2, 8, 6, 1, 7};
        //int givenNo = 7;
        getContSubArrayWhoseSumEqualsGivenNum(numArray, givenNo);
    }
    public static void getContSubArrayWhoseSumEqualsGivenNum(int[] arr, int givenNo){
        int sum = 0;
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Result :");
        for (int start = 0; start < arr.length; start++) {
            sum = arr[start];
            int end = start+1;
            for (; (end < arr.length && sum < givenNo); end++) {
                sum+=arr[end];
            }
            if(sum == givenNo){
                System.out.print("[ ");
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
