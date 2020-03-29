package ephraim.algo.sortings;

import java.util.Arrays;

import ephraim.algo.helpers.SortHelper;

public class Main {
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 100, 1000000);
        Comparable[] copy1 = Arrays.copyOf(arr, arr.length);
        Comparable[] copy2 = Arrays.copyOf(arr, arr.length);
        Comparable[] copy3 = Arrays.copyOf(arr, arr.length);
        Comparable[] copy4 = Arrays.copyOf(arr, arr.length);

/*        SortHelper.testSort("ephraim.algo.sortings.SelectionSort", arr);
        SortHelper.testSort("ephraim.algo.sortings.InsertionSort", copy1);*/
        // SortHelper.testSort("ephraim.algo.sortings.QuickSort", arr);
        long a = System.currentTimeMillis();
        QuickSort.sort2(copy1);
        long b = System.currentTimeMillis();
        System.out.println("ephraim.algo.sortings.QuickSort2 time used: " + (b - a) + "ms");

        a = System.currentTimeMillis();
        QuickSort.sort3(copy4);
        b = System.currentTimeMillis();
        System.out.println("ephraim.algo.sortings.QuickSort3 time used: " + (b - a) + "ms");

        SortHelper.testSort("ephraim.algo.sortings.ShellSort", copy2);
        SortHelper.testSort("ephraim.algo.sortings.MergeSort", copy3);

        //InsertionSort.show(copy2);

        /*Comparable[] charr = SortHelper.generateArr("sampleexample");
        SortHelper.testSort("ephraim.algo.sortings.InsertionSort", charr);
        InsertionSort.show(charr);

        System.out.println(InsertionSort.isSorted(charr));*/

        /*ShellSort.show(arr);
        System.out.println("============ partition ============");
        ShellSort.sort(arr);
        ShellSort.show(arr);*/
    }
}
