package ephraim.algo.basics;

public class Practices {
    public static void main(String[] args) {
        print2DBoolean(10, 10);
        /**
         * -	*	-	-	*	-	*	-	*	-
         * -	-	-	-	*	*	-	-	*	-
         * -	*	*	*	-	*	-	*	-	-
         * *	-	-	*	-	-	*	*	-	*
         * -	-	*	-	-	*	-	*	*	-
         * -	-	-	*	-	-	-	*	*	-
         * -	*	*	-	*	*	-	-	-	*
         * *	-	*	*	*	-	-	*	*	*
         * *	*	-	*	*	*	-	-	*	*
         * -	*	*	*	-	*	*	-	-	-
         */

        qn1_1_6();

        System.out.println("- qn 1.1.19 ");
        System.out.println(fibo(10));

        System.out.println("- qn 1.1.16 ");
        System.out.println(exR1(6));

        System.out.println("- qn 1.1.18");
        System.out.println(mystery(3, 11));

        System.out.println("- qn 1.1.20");
        int n = 10;
        System.out.println(log2N(n)>0 ? log2N(n) : "invalid input");
        System.out.println(log2NRec(n));

        System.out.println();
        System.out.println("binary search implementation");
        int[] arr = {-1, 1, 2, 3, 5, 7, 9, 10, 34, 5675};
        System.out.println(binarySearch(arr, 10, 0, arr.length - 1));

    }

    // qn 1.1.11
    public static void print2DBoolean(int rows, int cols) {
        // generate the array
        boolean[][] twoDbool = new boolean[rows][cols];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDbool[i][j] = ((int) (Math.random() * 2) ) == 1;
            }
        }

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDbool[i][j] ? "*\t" : "-\t" );
            }
            System.out.println();
        }

    }

    // qn 1.1.6
    public static void qn1_1_6() {
        System.out.println("- qn 1.1.6 ");
        int f = 0, g = 1;
        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    // qn 1.1.19
    public static int fibo(int n) { // calculate 0 - nth fibonacci
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);

    }

    // qn 1.1.16
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }

        return exR1(n - 3) + n + exR1(n - 2) + n;

    }

    // qn 1.1.18
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b % 2 == 0) {
            return mystery(a + a, b / 2);

        }

        return mystery(a + a, b / 2) + a;
    }

    // qn 1.1.20 log2N()
    public static int log2N(int n) {
        if (n <= 0) {
            return -1;
        }

        int res = 0;
        for (int i = n; i > 1; i /= 2) {
            res ++;
        }

        return res;
    }

    public static int log2NRec(int n) {
        if (n < 0) {
            return -1;
        }

        if(n > 1) {
            return 1 + log2NRec(n / 2);
        }

        return 0;
    }

    public static int binarySearch(int[] arr, int val, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == val) {
            return mid;
        } else if (val < arr[mid]) {
            return binarySearch(arr, val, left, mid - 1);
        } else {
            return binarySearch(arr, val, mid + 1, right);
        }

    }

}


































