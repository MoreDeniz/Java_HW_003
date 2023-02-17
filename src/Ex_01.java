// 1.Реализовать алгоритм сортировки слиянием
// Сортировка осуществляется путём сравнения наименьших элементов каждого подмассива.
// Первые элементы каждого подмассива сравниваются первыми.
// Наименьший элемент перемещается в результирующий массив.
// Счётчики результирующего массива и подмассива, откуда был взят элемент, увеличиваются на один.

import java.util.Arrays;

public class Ex_01 {
    private static int[] result;

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 4, 0, 9, 9, 10};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
        System.out.println(Arrays.toString(result));
    }
    // делим массив на две половины
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
        return merge(mergeSort(left), mergeSort(right));
    }
    // собираем массив
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        // счетчики для индекса каждого из массивов:
        int resIn = 0, leftIn = 0, rightIn = 0;

        while (leftIn < left.length && rightIn < right.length)
            if (left[leftIn] < right[rightIn])
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];

        while (resIn < result.length)
            if (leftIn != left.length)
                result[resIn++] = left[leftIn++];
            else result[resIn++] = right[rightIn++];
        return result;
    }
}
