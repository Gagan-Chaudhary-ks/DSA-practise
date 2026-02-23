package array;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args){

        int[] arr = {1,2,10,1,0,3,12};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] arr){
        if(arr.length <2 ) return;
        int j=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] != 0){
                if(i!=j){
                    swap(arr,i,j);
                }
                j++;
            }
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
