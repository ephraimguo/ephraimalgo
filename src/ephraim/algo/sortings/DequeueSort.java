package ephraim.algo.sortings;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2.1.14
 */
public class DequeueSort extends SortInsatnce{
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<Integer>();
        Queue<Integer> P = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Q.add((int) (Math.random() * 20));
        }

        //DequeueSort dequeueSort = new DequeueSort<>();

        DequeueSort.show(Q);
        DequeueSort.sort(Q, P);
        DequeueSort.show(Q);
        DequeueSort.show(P);
    }

    public static void sort(Queue<Integer> Q, Queue<Integer> P) {
        // 1st loop to remain the biggest number on top
        Integer[] arr = (Integer[]) Q.toArray(new Integer[Q.size()]);

        while (!Q.isEmpty()) {
            for (int i = 0; i < Q.size(); i++) {
                swapHead(Q);
                toEnd(Q);
            }

            P.add(Q.remove());
        }

    }

    public static void toEnd(Queue Q) {
        Q.add(Q.remove());
    }

    public static void show(Queue Q) {
        Object[] arr = Q.toArray();

        if (Q.isEmpty()) {
            System.out.println("Queue is empty");

        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }

            System.out.println();

        }


    }

    public static void swapHead(Queue Q) {
        Integer[] ar = (Integer[]) Q.toArray(new Integer[Q.size()]);

        Comparable[] arr = (Integer[]) ar;

        int n = arr.length;

        if (arr.length <= 1 || arr[0].compareTo(arr[1]) < 0) {
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
