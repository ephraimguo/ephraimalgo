package ephraim.algo.datastructures;

import com.sun.media.jfxmediaimpl.HostUtils;
import ephraim.algo.helpers.SortHelper;
import ephraim.algo.sortings.QuickSort;

public class BinarySearch {
    public static int search(Comparable[] arr, Comparable target, int left, int right) {
        if (left >= right) {
            if (arr[left].equals(target)) {
                return left;
            }

            return -1;
        }

        int mid = left + (right - left) / 2;

        if (target.equals(arr[mid])) {
            return mid;

        } else if (target.compareTo(arr[mid]) < 0) {
            return search(arr, target, left, mid - 1);

        } else {
            return search(arr, target, mid + 1, right);

        }
    }

    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 10, 10);
        QuickSort.sort(arr);
        QuickSort.show(arr);

        int idx = search(arr, 6, 0, arr.length - 1);
        System.out.println(idx);

    }

}
