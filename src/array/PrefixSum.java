package array;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int[] arr = {5,3,2,6};
        int[] prefixSumArr = buildPrefix(arr);
        System.out.println(Arrays.toString(prefixSumArr));
    }

    static int[] buildPrefix(int[] arr){
        if(arr.length == 0){
            return new int[0];
        }
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        return prefix;
    }
}
