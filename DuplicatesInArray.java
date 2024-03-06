import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,1,4,5,4};
        int[] arrayTwo = {7,2,5,7,5,5,7};
        System.out.println("Array One : "+Arrays.toString(arrayOne));
        System.out.println("Array Two : "+Arrays.toString(arrayTwo));
        System.out.println("By Iterations");
        duplicatesByIterations(arrayOne);
        duplicatesByIterations(arrayTwo);
        System.out.println("By Sorting");
        duplicatesBySorting(arrayOne);
        duplicatesBySorting(arrayTwo);
        System.out.println("By Hashset");
        duplicatesByHashset(arrayOne);
        duplicatesByHashset(arrayTwo);
        System.out.println("By Hashmap");
        duplicatesByHashmap(arrayOne);
        duplicatesByHashmap(arrayTwo);
        System.out.println("By Streams");
        duplicatesByStreams(arrayOne);
        duplicatesByStreams(arrayTwo);
    }
    public static void duplicatesByIterations(int[] noArray){
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < noArray.length; i++) {
            for (int j = i+1; j < noArray.length; j++) {
                if(noArray[i] == noArray[j] && !dups.contains(noArray[i])){
                    dups.add(noArray[i]);
                }
            }
        }
        System.out.println("Duplicates: "+dups);
    }
    public static void duplicatesBySorting(int[] noArray){
        Arrays.sort(noArray);
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < noArray.length-1; i++) {
            if(noArray[i] == noArray[i+1] && !dups.contains(noArray[i])){
                dups.add(noArray[i]);
            }
        }
        System.out.println("Duplicates: "+dups);
    }
    public static void duplicatesByHashset(int[] noArray){
        Set<Integer> numbers = new HashSet<Integer>();
        List<Integer> dups = new ArrayList<>();
        for (int num : noArray){
            if(!numbers.add(num) && !dups.contains(num)){
                dups.add(num);
            }
        }
        System.out.println("Duplicates: "+dups);
    }
    public static void duplicatesByHashmap(int[] noArray){
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int num : noArray){
            if(!numCount.containsKey(num)){
                numCount.put(num, 1);
            } else {
                numCount.put(num, numCount.get(num)+1);
            }
        }
        System.out.println("Duplicates: ");
        Set<Entry<Integer, Integer>> entrySet = numCount.entrySet();
        for (Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println("No: "+entry.getKey()+", Occurrence: "+entry.getValue());
            }
        }
    }
    public static void duplicatesByStreams(int[] noArray){
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> dups = Arrays.stream(noArray)
                .filter(i -> !uniqueNumbers.add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("Duplicates: "+dups);
    }
}
