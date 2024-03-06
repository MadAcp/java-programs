public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] inputArray = {2,1,4,5,6,2,3,6,7, 7}; //Second largest is 6
        int largestNo, secondLargestNo ;
        if(inputArray[0]>inputArray[1]){
            largestNo = inputArray[0];
            secondLargestNo = inputArray[1];
        } else {
            largestNo = inputArray[1];
            secondLargestNo = inputArray[0];
        }
        for (int i = 2; i < inputArray.length; i++) {
            if(inputArray[i] > largestNo){
                secondLargestNo = largestNo;
                largestNo = inputArray[i];
            } else if (inputArray[i] > secondLargestNo && inputArray[i] < largestNo) {
                secondLargestNo = inputArray[i];
            }
        }
        System.out.println("Largest: "+largestNo);
        System.out.println("Second Largest: "+secondLargestNo);
    }
}
