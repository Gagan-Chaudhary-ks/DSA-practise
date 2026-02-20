package array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateRightByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateRightByOne(int[] arr) {

        if(arr.length<=1) return ;

        int first = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = first;
    }
}
