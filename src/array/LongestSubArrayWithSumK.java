package array;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args){
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        int maxLen = longestSubArray(arr,k);
        System.out.println(maxLen);
    }

    static int longestSubArray(int[] arr, int k) {

        HashMap<Integer,Integer> prefixSumIndex = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;

        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];

            if(prefixSum == k){
                maxLen = i+1;
            }

            int rem = prefixSum - k;
            if(prefixSumIndex.containsKey(rem)){
                maxLen = max(maxLen,i-prefixSumIndex.get(rem));
            }
            if(!prefixSumIndex.containsKey(prefixSum)){
                prefixSumIndex.put(prefixSum,i);
            }
        }
        return maxLen;
    }

    static int max(int a, int b){
        return a < b ? b : a ;
    }
}
