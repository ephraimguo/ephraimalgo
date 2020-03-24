package ephraim.algo.sortings;

import javax.xml.bind.annotation.XmlInlineBinaryData;

public class SelectionSort extends SortInsatnce{

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;

                }

            }

            swap(arr, i, min);
        }
    }

    public static void show(Comparable[] arr) {
        System.out.println("selection sort show result ");
        SortInsatnce.show(arr);

    }
}
