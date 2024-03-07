public class ReverseAddUntilGetPalindrome {
    public static void main(String[] args) {
        int number = 1434;
        int reverseNo = Integer.parseInt(new StringBuffer(String.valueOf(number)).reverse().toString());
        System.out.println(number+" : "+reverseNo);
        while (number != reverseNo){
            System.out.println(number+" + "+reverseNo+" = "+(number+reverseNo));
            number += reverseNo;
            reverseNo = Integer.parseInt(new StringBuffer(String.valueOf(number)).reverse().toString());
        }
        System.out.println(number+" : "+reverseNo);
    }
}
