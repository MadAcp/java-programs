import java.util.Arrays;
import java.util.Objects;

public class CheckArrayEquality {
    public static void main(String[] args) {
        int[] numArr1 = {1, 2, 3, 4};
        int[] numArr2 = {1, 2, 3, 4, 5};
        int[] numArr3 = {1, 2, 3, 4};
        int[] numArr4 = {1, 5, 3, 4};

        /* numArr1 != numArr2, numArr1 = numArr3, numArr1 != numArr4
        Expected Output
        [1, 2, 3, 4] Not Equals [1, 2, 3, 4, 5]
        [1, 2, 3, 4] Equals [1, 2, 3, 4]
        [1, 2, 3, 4] Not Equals [1, 5, 3, 4]
        */
        if(isEqualByIteration(numArr1, numArr2)){
            System.out.println(Arrays.toString(numArr1) + " Equals "+ Arrays.toString(numArr2));
        } else {
            System.out.println(Arrays.toString(numArr1) + " Not Equals "+ Arrays.toString(numArr2));
        }

        if(isEqualByIteration(numArr1, numArr3)){
            System.out.println(Arrays.toString(numArr1) + " Equals "+ Arrays.toString(numArr3));
        } else {
            System.out.println(Arrays.toString(numArr1) + " Not Equals "+ Arrays.toString(numArr3));
        }

        if(isEqualByIteration(numArr1, numArr4)){
            System.out.println(Arrays.toString(numArr1) + " Equals "+ Arrays.toString(numArr4));
        } else {
            System.out.println(Arrays.toString(numArr1) + " Not Equals "+ Arrays.toString(numArr4));
        }

        Bag[] bagArr1 = {
                new Bag("A",false),
                new Bag("A", true)
        };
        Bag[] bagArr2 = {
                new Bag("A",false),
                new Bag("A", true)
        };
        Bag[] bagArr3 = {
                new Bag("A",false),
                new Bag("B", true)
        };

        /*bagArr1 = bagArr2, bagArr1 != bagArr3
        [Bag{bagName='A', isEmpty=false}, Bag{bagName='A', isEmpty=true}] Equals
        [Bag{bagName='A', isEmpty=false}, Bag{bagName='A', isEmpty=true}]

        [Bag{bagName='A', isEmpty=false}, Bag{bagName='A', isEmpty=true}] Not Equals
        [Bag{bagName='A', isEmpty=false}, Bag{bagName='B', isEmpty=true}]
        */
        if(isEqualByArraysEquals(bagArr1, bagArr2)){
            System.out.println(Arrays.toString(bagArr1) + " Equals "+ Arrays.toString(bagArr2));
        } else {
            System.out.println(Arrays.toString(bagArr1) + " Not Equals "+ Arrays.toString(bagArr2));
        }

        if(isEqualByArraysEquals(bagArr1, bagArr3)){
            System.out.println(Arrays.toString(bagArr1) + " Equals "+ Arrays.toString(bagArr3));
        } else {
            System.out.println(Arrays.toString(bagArr1) + " Not Equals "+ Arrays.toString(bagArr3));
        }
    }
    public static boolean isEqualByIteration(int[] arrayOne, int[] arrayTwo){
        if(arrayOne.length == arrayTwo.length){
            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i])
                    return false;
            }
            return true;
        }
        return false;
    }
    public static boolean isEqualByArraysEquals(Object[] arrayOne, Object[] arrayTwo){
        if(arrayOne.length == arrayTwo.length){
            return Arrays.equals(arrayOne, arrayTwo);
        }
        return false;
    }
}

class Bag{
    String bagName;
    Boolean isEmpty;

    public Bag(String bagName, Boolean isEmpty) {
        this.bagName = bagName;
        this.isEmpty = isEmpty;
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return Objects.equals(this.bagName, bag.bagName) && Objects.equals(this.isEmpty, bag.isEmpty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bagName, this.isEmpty);
    }

    @Override
    public String toString() {
        return "Bag{" +
                "bagName='" + bagName + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
