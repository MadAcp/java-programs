public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int inputNo = 13542;
        int number = inputNo;
        int sum = 0;
        while (inputNo>0){
            sum += inputNo%10;
            inputNo /= 10;
        }
        System.out.println("Number: "+number+", Sum of Digits: "+sum);
    }
}
