package ephraim.algo.sortings;

import java.util.LinkedList;
import java.util.Queue;

public class DequeueSort<T extends Comparable<T>> extends SortInsatnce{
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            Q.add((int) (Math.random() * 20));
        }

        //DequeueSort dequeueSort = new DequeueSort<>();

        /*DequeueSort.show(Q);
        DequeueSort.toEnd(Q);
        DequeueSort.show(Q);

        DequeueSort.swapHead(Q);
        DequeueSort.show(Q);*/

    }

    public static void sort(Queue<Integer> Q) {
        // 1st loop to remain the biggest number on top
        Integer[] arr = (Integer[]) Q.toArray();

        for (int i = 0; i < Q.size(); i++) {
            swapHead(Q);
            toEnd(Q);
        }
    }

    public static void toEnd(Queue Q) {
        Q.add(Q.remove());
    }

    public static void show(Queue Q) {
        Object[] arr = Q.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        System.out.println();
    }

    public static void swapHead(Queue Q) {
        Integer[] ar = (Integer[]) Q.toArray(new Integer[Q.size()]);

        Comparable[] arr = (Integer[]) ar;

        int n = arr.length;

        if (arr[0].compareTo(arr[1]) < 0) {
            return;
        }

        Comparable temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        Q.clear();
        for (int i = 0; i < n; i++) {
            Q.add(arr[i]);

        }

    }

}
