package Array;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {Integer.MIN_VALUE,1};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);

    }

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = arr[0];
        int secondLargest = arr[0];
        Boolean foundSecond = false;

        for(int i=1;i<arr.length;i++){
            int current = arr[i];

            if(current > largest){
                secondLargest = largest;
                largest = current;
                foundSecond = true;
            }
            else if(current < largest){
                if(!foundSecond || current > secondLargest){
                    secondLargest = current;
                    foundSecond = true;

                }
            }

        }
        return (foundSecond == true) ? secondLargest : -1;
    }
}