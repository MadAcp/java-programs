public class StringRemoveSpaces {
    public static void main(String[] args) {
        String inputStr = "Hi this is  some    input    String with     tab and multiple   spaces";
        System.out.println("Before space removal:\n"+inputStr);
        System.out.println("Using Regular Expression:\n"+usingRegEx(inputStr));
        System.out.println("Using Character Array:\n"+usingCharArray(inputStr));
    }
    public static String usingRegEx(String str){
        return str.replaceAll("\\s+","");
    }
    public static String usingCharArray(String str){
        String newStr = "";
        char[] strChars = str.toCharArray();
        for (char strChar : strChars) {
            if (strChar != ' ') {
                newStr += strChar;
            }
        }
        return newStr;
    }
}
