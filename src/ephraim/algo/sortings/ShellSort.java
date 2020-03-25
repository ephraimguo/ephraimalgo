package ephraim.algo.sortings;

/**
 *
 */
public class ShellSort extends SortInsatnce {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        int gap = n / 2;

        // only switch 1 time
        while (gap >= 1) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j >=gap && arr[j].compareTo(arr[j - gap]) < 0; j -= gap) {
                    swap(arr, j, j - gap);

                }

            }

            gap /= 2;

        }

        // System.out.println("============= sorting finished =============");

    }

    public static void show(Comparable[] arr) {
        System.out.println("Shell sort showing result");
        SortInsatnce.show(arr);

    }
}
