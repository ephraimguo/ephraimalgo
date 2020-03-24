package ephraim.algo.sortings;

public class InsertionSort extends SortInsatnce{
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
                swap(arr, j, j - 1);

            }
        }
    }

    public static void show(Comparable[] arr) {
        System.out.println("insertion sort show result");
        SortInsatnce.show(arr);

    }

}
