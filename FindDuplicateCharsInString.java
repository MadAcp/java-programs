import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsInString {
    public static void main(String[] args) {
        String inputString = "Bitter Butter Best";
        char[] characters = inputString.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char character: characters){
            if (charCountMap.containsKey(character)){
                charCountMap.put(character, charCountMap.get(character)+1);
            } else {
                charCountMap.put(character, 1);
            }
        }

        Set<Character> keys = charCountMap.keySet();
        System.out.println("Character count :");
        for (Character key: keys){
            System.out.println("Char: "+key+", Count: "+charCountMap.get(key));
        }
        System.out.println("Duplicate Characters");
        for (Character key: keys){
            if(charCountMap.get(key)>1)
                System.out.print(" "+key);
        }
    }
}
