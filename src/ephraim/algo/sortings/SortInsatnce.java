package ephraim.algo.sortings;

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
            if (less(arr[i - 1], arr[i])) {
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
