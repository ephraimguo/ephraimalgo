package ephraim.algo.sortings;

import ephraim.algo.helpers.SortHelper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 10, 1000);
        Comparable[] copy1 = Arrays.copyOf(arr, arr.length);

        SortHelper.testSort("ephraim.algo.sortings.SelectionSort", arr);
        SortHelper.testSort("ephraim.algo.sortings.InsertionSort", copy1);

        Comparable[] charr = SortHelper.generateArr("sampleexample");
        SortHelper.testSort("ephraim.algo.sortings.InsertionSort", charr);
        InsertionSort.show(charr);

        System.out.println(InsertionSort.isSorted(charr));

    }
}
