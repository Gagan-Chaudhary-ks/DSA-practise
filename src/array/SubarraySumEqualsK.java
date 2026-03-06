package array;

public class SubarraySumEqualsK {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,4};
        int count = subarrSum(arr,4);
        System.out.println(count);
    }
    static int subarrSum(int[] arr,int k){
        int count = 0;
        for(int i=0;i<arr.length; i++){
            int sum =0;
            for(int j=i;j<arr.length; j++){
                sum+= arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
