package binarySearch;

import java.util.Arrays;

/**
 * @author xiehongfei
 * @description
 * @date 2023/7/31 21:48
 */
public class BinarySearch {

    public static int search(int[] arr, int number) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (number < arr[mid]) {
                high = mid - 1;
            } else if (number > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 78, 2, 7, 5};
        Arrays.sort(arr);
        int search = search(arr, 3);
        System.out.println(search);
    }
}
