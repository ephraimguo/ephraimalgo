package ephraim.algo.helpers;

import ephraim.algo.sortings.SortInsatnce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class SortHelper {
    public static Comparable[] generateArr(int min, int max, int len) {
        Random random = new Random();
        Comparable[] arr = new Comparable[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;;
        }

        return arr;
    }

    public static Comparable[] generateArr(String str) {
        Comparable[] arr = new Comparable[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    public static void testSort(String className, Comparable[] arr) {
        try {
            Class<?> Testee = Class.forName(className);

            Method sort_method = Testee.getMethod("sort", new Class[]{Comparable[].class});

            Object[] args = new Object[]{arr};

            long start_ts = System.currentTimeMillis();
            sort_method.invoke(null, args);
            long end_ts = System.currentTimeMillis();

            System.out.println(className + " time used: " + (end_ts - start_ts) + " ms");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }


}
