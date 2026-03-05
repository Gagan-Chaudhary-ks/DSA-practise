package array;

public class RangeSum {
    public static void main(String[] args){
        int[] arr = {4,1,7,3,6};
        int left = 0;
        int right = 2;
        int sum = rangeSum(arr,left,right);
        System.out.println(sum);
    }
    static int rangeSum(int[] arr, int left, int right){
        int sum = 0;
        int[] prefix = prefixSum(arr);

        if(left == 0){
            sum = prefix[right];
        }else {
            sum = prefix[right] - prefix[left - 1];
        }
            return sum;
    }

    static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        return prefix;
    }
}
