package array;

public class FindMissingNumberFrom0ToNUsingXOR {
    public static void main(String[] args){
        int[] arr = {0,6,4,2,1,5};
        System.out.println(findMissingXOR(arr));
    }

    static int findMissingXOR(int[] arr){
        int n = arr.length;
        int xor = n;

        for(int i=0;i<n;i++){
            xor = xor ^ i ^ arr[i];
        }
        return xor;
    }
}
