import java.util.Arrays;

public class ReverseWithPreservingSpace {
    public static void main(String[] args) {
        String input = "I am not";
        System.out.println("Input : "+Arrays.toString(input.toCharArray()));
        System.out.println(reverseStringWithSpacesPreservedUsingSBuf(input));
        System.out.println();
        System.out.println(reverseStringWithSpacesPreserved(input));
    }
    public static String reverseStringWithSpacesPreserved(String input){
        char[] inputStrChars = input.toCharArray();
        char[] reversedCharArray = new char[inputStrChars.length];

        for (int i = inputStrChars.length-1, j=0; i >= 0 ; i--) {
            if (inputStrChars[i] != ' '){
                if(inputStrChars[j] == ' ') {
                    reversedCharArray[j] = ' ';
                    i++;
                } else {
                    reversedCharArray[j] = inputStrChars[i];
                }
                j++;
            }
        }

        System.out.println();
        return Arrays.toString(reversedCharArray);
    }
    public static String reverseStringWithSpacesPreservedUsingSBuf(String input){
        char[] inputStrChars = input.toCharArray();

        StringBuffer stringBuffer = new StringBuffer(input.replaceAll("\\s+","")).reverse();
        char[] charToFill = stringBuffer.toString().toCharArray();

        char[] reversedCharArray = new char[inputStrChars.length];

        for (int i = 0, j = 0; i < inputStrChars.length; i++) {
            if(inputStrChars[i]!=' '){
                reversedCharArray[i] = charToFill[j];
                j++;
            } else {
                reversedCharArray[i] = ' ';
            }
        }

        return Arrays.toString(reversedCharArray);
    }
}
