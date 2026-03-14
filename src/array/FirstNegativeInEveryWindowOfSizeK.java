package array;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class FirstNegativeInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        ArrayList <Integer> negNums = new ArrayList<>();
        negNums = firstNegativeInWindow(arr,k);
        System.out.println(negNums);
    }

    static ArrayList firstNegativeInWindow(int[] arr, int k) {
        int i = 0;
        int j = 0;
        ArrayList <Integer> list = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();

        while (j <arr.length){
            if(arr[j] < 0){
                q.add(j);
            }
            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1) == k){
                if(q.isEmpty()){
                    list.add(0);
                }
                else{
                    list.add(arr[q.peek()]);
                }
                if(!q.isEmpty() && q.peek() == i){
                    q.poll();
                }
                i++;
                j++;
            }
        }

        return list;
    }
}
