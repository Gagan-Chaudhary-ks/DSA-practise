package array;

public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {1,1,0,0,0,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
    static int maxConsecutiveOnes(int[] arr){
        int currentCount = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                currentCount++;
                maxCount = max(maxCount,currentCount);
            }
            else{
                currentCount = 0;
            }
        }
        return maxCount;
    }
    static int max(int a, int b){
        return a<b ? b : a;
    }
}
