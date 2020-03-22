package ephraim.algo.sortings;

import com.sun.tools.internal.xjc.AbortException;

public class SortInsatnce {
    public static void sort(Comparable[] arr) {

    }

    public static void show(Comparable[] arr) {
        for (Comparable comparable: arr
             ) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1])) {
                return false;
            }
        }

        return true;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    public static void swap(Comparable[] arr, int n, int m) {
        Comparable temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }

}
