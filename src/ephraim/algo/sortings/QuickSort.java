package ephraim.algo.sortings;

import ephraim.algo.helpers.SortHelper;

public class QuickSort extends SortInsatnce {
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 50, 10);
        QuickSort.show(arr);

        System.out.println();

        QuickSort.sort3(arr);
        QuickSort.show(arr);

    }

    public static void sort(Comparable[] arr) {
        int right = arr.length - 1; // arr's max index

        internalSort(arr, 0, right);
    }

    public static void sort2(Comparable[] arr) {
        int right = arr.length - 1;

        internalSort2(arr, 0, right);
    }

    public static void sort3(Comparable[] arr) {
        int right = arr.length - 1;

        internalSort2(arr, 0, right);
    }

    public static void internalSort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int x = (int) (left + Math.random() * (right - left));
        swap(arr, left, x);

        Comparable v = arr[left];
        int pivot = left;

        for (int i = left + 1; i <= right; i++) {
            if(arr[i].compareTo(v) < 0){
                swap(arr, i, pivot+1);
                pivot++;
            }

        }

        swap(arr, left, pivot);

        internalSort(arr, left, pivot - 1);
        internalSort(arr, pivot + 1, right);

    }

    public static void internalSort2(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int x = (int) (left + Math.random() * (right - left));
        swap(arr, left, x);

        Comparable v = arr[left];

        int left_prime = left + 1;
        int right_prime = right;

        while (true) {
            while (left_prime <= right && arr[left_prime].compareTo(v) < 0) {
                left_prime++;

            }

            while (right_prime >= left + 1 && arr[right_prime].compareTo(v) > 0) {
                right_prime--;

            }

            if (left_prime >= right_prime) {
                break;

            }

            swap(arr, right_prime, left_prime);

            right_prime--;
            left_prime++;

        }

        swap(arr, right_prime, left);

        internalSort2(arr, left, left_prime - 1);
        internalSort2(arr, left_prime + 1, right);

    }

    /**
     * Quick sort 3 ways
     * @param arr arr to be sorted
     * @param left left boundary
     * @param right right boundary
     */
    public static void internalSort3(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        Comparable v = arr[left];
        int less = left;
        int greater = right + 1;
        int idx = left + 1;

        while (idx < greater) {
            if (arr[idx].compareTo(v) < 0) {
                swap(arr, idx, less + 1);
                less++;
                idx++;

            }

            if (arr[idx].compareTo(v) > 0) {
                swap(arr, idx, greater - 1);
                greater--;

            }

            if (arr[idx].equals(v)) {
                idx++;
            }

        }

        swap(arr, less, left);
        internalSort3(arr, left, less - 1);
        internalSort3(arr, greater -  1, right);

    }

    public static void show(Comparable[] arr) {
        System.out.println("QuickSort showing result");
        SortInsatnce.show(arr);

    }
}





















