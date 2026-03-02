package array;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,7,5,12};
        int targVal = 9;

        int[] idx = twoSum(arr,targVal);
        System.out.println(Arrays.toString(idx));
    }
    static int[] twoSum(int[] arr, int targVal){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){

           int complement = targVal - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
