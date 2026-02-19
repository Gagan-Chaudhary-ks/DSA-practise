package Array;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        int largest = findLargest(arr);
        System.out.println(largest);
    }

    static int findLargest(int[] arr){
        int largest =arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

}

