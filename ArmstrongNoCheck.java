public class ArmstrongNoCheck {
    public static void main(String[] args) {
        int inputNo1 = 153;
        int inputNo2 = 2153;
        if (isArmstrongNo(inputNo1)){
            System.out.println(inputNo1 +" is an Armstrong Number");
        } else {
            System.out.println(inputNo1 +" is Not an Armstrong Number");
        }
        if (isArmstrongNo(inputNo2)){
            System.out.println(inputNo2 +" is an Armstrong Number");
        } else {
            System.out.println(inputNo2 +" is Not an Armstrong Number");
        }
    }
    public static boolean isArmstrongNo(int input){
        int number = input;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (number%10>0){
            int lastDigit = number%10;
            int lastDigPowerSum = 1;
            for (int i = 0; i < noOfDigits; i++) {
                lastDigPowerSum *= lastDigit;
            }
            sum += lastDigPowerSum;
            number /= 10;
        }
        return input == sum;
    }
}
