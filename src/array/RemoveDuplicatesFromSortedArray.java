package array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        int val = removeDuplicates(arr);
        System.out.println(val);
        
    }

    static int removeDuplicates(int[] arr){
        if(arr.length < 2) return arr.length;
        int len = arr.length;
        int j =0;

        for(int i=1;i<len;i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;

    }

}
