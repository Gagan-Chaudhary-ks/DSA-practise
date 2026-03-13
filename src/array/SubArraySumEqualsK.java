package array;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {9, 4, 0, 20, 3, 10, 5};
        int k = 33;
        int count = subArraySum(arr, k);
        System.out.println(count);
    }

    static int subArraySum(int[] arr, int k) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ps = new int[arr.length];

        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            int currSum = ps[j];
            if (currSum == k) {
                count++;
            }
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        }

        return count;

    }
}