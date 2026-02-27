package array;

public class MissingNumberFrom0ToN {
    public static void main(String[] args){
        int[] arr = {3,6,4,2,1,5};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int actualSum = 0;
        int n = arr.length;
        int expectedSum  = (n*(n+1)/2) ;

        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }

        return (expectedSum - actualSum);
    }
}
