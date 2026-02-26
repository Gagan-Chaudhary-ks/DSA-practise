package array;

public class SortedAndRotated {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 4, 5,1};
        int[] arr = {1,2,3,4,5};
        System.out.println(isSortedAndRotated(arr));
    }

    static boolean isSortedAndRotated(int[] arr) {
        if (arr.length < 2) return true;

        int count =0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
        }
        return count<=1;

    }

}