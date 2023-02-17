// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Collections;

public class Ex_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15, 14, 18, 33, 37, 1);
        System.out.println(list);
        ArrayList<Integer> odd = delEven(list);
        System.out.println(odd);
    }
    private static ArrayList<Integer> delEven(ArrayList<Integer> data) {
        data.removeIf(integer -> integer % 2 == 0);
        return data;
    }
}
