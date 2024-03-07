import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairsWhoseSumEqualGivenNumInArray {
    public static void main(String[] args) {
        Integer[] numArray = {1,3,2,5,7,3,4,9,8};
        int givenNo = 9;
        // Result: [1,8], [2,7], [5,4]
        List<Integer> numList = Arrays.asList(numArray);
        for (int i = 0; i < numList.size(); i++) {
            if(numList.subList(i+1,numList.size()).contains(givenNo-numList.get(i))){
                System.out.print("["+numList.get(i)+", "+(givenNo-numList.get(i))+"] ");
            }
        }
    }
}
