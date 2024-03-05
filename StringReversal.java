public class StringReversal {
    public static void main(String[] args) {
        String inputString = "IntelliJ";
        System.out.println("Reversal Using Character Array");
        reverseWithCharArray(inputString);
        System.out.println("\nReversal Using String Buffer");
        reverseWithStrBuffer(inputString);
        System.out.println("Reversal Using Recursive Function");
        System.out.println(reverseWithRecursive(inputString));
    }

    public static void reverseWithCharArray(String str){
        char[] strChars = str.toCharArray();
        for (int i = strChars.length-1; i >= 0 ; i--) {
            System.out.print(strChars[i]);
        }
    }

    public static void reverseWithStrBuffer(String str){
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println(strBuffer.reverse());
    }

    public static String reverseWithRecursive(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        return reverseWithRecursive(str.substring(1)) + str.charAt(0);
    }
}
