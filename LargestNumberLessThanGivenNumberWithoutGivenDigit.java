public class LargestNumberLessThanGivenNumberWithoutGivenDigit {
    public static void main(String[] args) {
        int givenNo = 899;
        int digitToAvoid = 9;
        // Output should be 888
        // Samples:
        //98 8 97
        //91 1 90
        //90 9 88
        //844 4 839
        //899 9 888
        System.out.println("Given: "+givenNo+" Digit to Avoid: "+digitToAvoid);
        System.out.println("Result: "+getLargestNumberLessThanGivenNumberWithoutGivenDigit(givenNo, digitToAvoid));
    }
    public static int getLargestNumberLessThanGivenNumberWithoutGivenDigit(int givenNo, int digitToAvoid){
        while (givenNo > 0){
            givenNo -= 1;
            if(!String.valueOf(givenNo).contains(String.valueOf(digitToAvoid))){
                return givenNo;
            }
        }
        return 0;
    }
}
