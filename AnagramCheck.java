import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Anagram: a word or phrase made by transposing the letters of another word or phrase.
        // The word "secure" is an anagram of "rescue."
        // Anagram Examples
        //"Mother in  law" and "Hitler women"
        //"Listen" and "Silent"

        String strOne = "Mother in law";
        String strTwo = "Hitler woman";
        String strThree = "Hisler woman";

        /* Output Expected :
        Mother in law is an Anagram of Hitler woman
        Mother in law is not an Anagram of Hisler woman
        */

        if(isStringsAnagram(strOne, strTwo)) {
            System.out.println(strOne+" is an Anagram of "+strTwo);
        } else {
            System.out.println(strOne+" is not an Anagram of "+strTwo);
        }

        if(isStringsAnagram(strOne, strThree)) {
            System.out.println(strOne+" is an Anagram of "+strThree);
        } else {
            System.out.println(strOne+" is not an Anagram of "+strThree);
        }
    }
    public static boolean isStringsAnagram(String str1, String str2){
        char[] str1Chars = str1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char[] str2Chars = str2.toLowerCase().replaceAll("\\s+","").toCharArray();
        if(str1Chars.length != str2Chars.length) {
            return false;
        } else {
            Arrays.sort(str1Chars);
            Arrays.sort(str2Chars);
            return Arrays.equals(str1Chars, str2Chars);
        }
    }
}
