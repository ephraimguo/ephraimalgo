package ephraim.algo.sortings;

import ephraim.algo.helpers.SortHelper;

import java.util.Arrays;

public class MergeSort extends SortInsatnce{
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 10, 20);
        MergeSort.show(arr);
        sort2(arr);
        MergeSort.show(arr);
    }

    public static void sort(Comparable[] arr) {
        int left = 0;
        int right = arr.length - 1;
        internalSort(arr, left, right);

    }

    public static void sort2(Comparable[] arr) { // bottom up
        int n = arr.length;
        for (int size = 1; size <= n; size += size) {
            for (int i = 0; i + size < n; i += size + size) {
                merge(arr, i + size - 1, i, Math.min(i + size + size - 1, n - 1));
            }
        }

    }

    public static void internalSort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;

        }

        int mid = left + (right - left) / 2;
        internalSort(arr, left, mid);
        internalSort(arr, mid + 1, right);

        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, mid, left, right);

        }
        // merge(arr, mid, left, right);
    }

    public static void merge(Comparable[] arr, int mid, int left, int right) {
        int left_idx = left;
        int right_idx = mid + 1;

        Comparable[] result = Arrays.copyOfRange(arr, left, right + 1);


        for (int i = left; i <= right; i++) {


            if (left_idx > mid) {
                arr[i] = result[right_idx - left];

                right_idx++;

            }else if (right_idx > right) {
                arr[i] = result[left_idx - left];

                left_idx++;

            }else if (result[left_idx - left].compareTo(result[right_idx - left]) < 0) {
                arr[i] = result[left_idx - left];

                left_idx++;

            } else if(result[left_idx - left].compareTo(result[right_idx - left]) >= 0){
                arr[i] = result[right_idx - left];

                right_idx++;

            }

        }

        Comparable[] result2 = Arrays.copyOfRange(arr, left, right + 1);

    }

    public static void show(Comparable[] arr) {
        // System.out.println("Shell sort showing result");
        SortInsatnce.show(arr);

    }


}

