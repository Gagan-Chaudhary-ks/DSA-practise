package array;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int k = 4; //k=any int Value

        System.out.println(Arrays.toString(arr));
        rotateRightByK(arr,k);
        System.out.println(Arrays.toString(arr));

    }

    static void rotateRightByK(int[] arr, int k){

        if(arr.length < 2 ) {
            return;
        }

        int n = arr.length ;
        k = k%n;

        if(k ==0) {
            return;
        }

        reverseArr(arr,0,n-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
    }

    static void reverseArr(int[] arr, int first, int last){
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
