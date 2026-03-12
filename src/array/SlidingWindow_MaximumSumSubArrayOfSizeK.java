package array;

public class SlidingWindow_MaximumSumSubArrayOfSizeK {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int maxSum = maxSumSubArray(arr,k);
        System.out.println(maxSum);
    }

    static int maxSumSubArray(int[] arr, int k) {
        if (arr.length < k) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < arr.length) {
            currSum += arr[j];

            if ((j - i + 1) < k) {
                j++;
            }
            else if (k == (j - i + 1)) {
                maxSum = max(maxSum, currSum);
                currSum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }
}
