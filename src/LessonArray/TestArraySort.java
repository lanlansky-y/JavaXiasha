package LessonArray;

import java.util.Arrays;

/*
数组相关方法的练习
 */
public class TestArraySort {
    public static void main(String[] args) {
        String str = "1";
        String str1 = new String("1");
        boolean b2 = str.equals(str1);
        System.out.println(b2);

        int[] arr1 = {1, 2, 3,};
        int[] arr2 = {1, 2, 3,};
        boolean b1 = arr1.equals(arr2);
        System.out.println(b1);

        int[] arr3 = {4, 3, 5, 6, 7, 8};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.binarySearch(arr3, 50));
    }
}
