package ephraim.algo.sortings;

import ephraim.algo.helpers.SortHelper;

import java.util.Arrays;

public class MergeSort extends SortInsatnce{
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 10, 20);
        MergeSort.show(arr);
        sort(arr);
        MergeSort.show(arr);
    }

    public static void sort(Comparable[] arr) {
        int left = 0;
        int right = arr.length - 1;
        internalSort(arr, left, right);

    }

    public static void internalSort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;

        }

        int mid = left + (right - left) / 2;
        internalSort(arr, left, mid);
        internalSort(arr, mid + 1, right);

        merge(arr, mid, left, right);
    }

    public static void merge(Comparable[] arr, int mid, int left, int right) {
        int left_idx = left;
        int right_idx = mid + 1;

        Comparable[] result = Arrays.copyOfRange(arr, left, right + 1);
        System.out.println("left: " + left);
        System.out.println("right: " + right);
        System.out.println("mid: " + mid);

        MergeSort.show(result);

        for (int i = left; i <= right; i++) {

            /*if (left_idx >= mid && right_idx >= right) {
                break;
            }*/

            if (left_idx > mid) {
                arr[i] = result[right_idx - left];
                //swap(arr, i, right_idx);

                right_idx++;

            }else if (right_idx > right) {
                arr[i] = result[left_idx - left];
                //swap(arr, i, left_idx);

                left_idx++;

            }else if (arr[left_idx].compareTo(arr[right_idx]) < 0) {
                arr[i] = result[left_idx - left];
                //swap(arr, i, left_idx);

                left_idx++;

            } else if(arr[left_idx].compareTo(arr[right_idx]) >= 0){
                arr[i] = result[right_idx - left];
                //swap(arr, i, right_idx);

                right_idx++;

            }

        }

        Comparable[] result2 = Arrays.copyOfRange(arr, left, right + 1);

        MergeSort.show(result2);
    }

    public static void show(Comparable[] arr) {
        // System.out.println("Shell sort showing result");
        SortInsatnce.show(arr);

    }


}

