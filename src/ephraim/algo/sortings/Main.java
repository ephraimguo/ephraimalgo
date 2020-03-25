package ephraim.algo.sortings;

import ephraim.algo.helpers.SortHelper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable[] arr = SortHelper.generateArr(0, 1000, 1000000);
        Comparable[] copy1 = Arrays.copyOf(arr, arr.length);
        Comparable[] copy2 = Arrays.copyOf(arr, arr.length);

        SortHelper.testSort("ephraim.algo.sortings.SelectionSort", arr);
        SortHelper.testSort("ephraim.algo.sortings.InsertionSort", copy1);
        SortHelper.testSort("ephraim.algo.sortings.ShellSort", copy2);
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
