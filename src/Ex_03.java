// 3.Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Ex_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15, 14);
        System.out.println(list);
        int min = minElem(list);
        System.out.printf("Минимальный элемент -> %d \n", min);
        int max = maxElem(list);
        System.out.printf("Максимальный элемент -> %d \n", max);
        int aver = average(list);
        System.out.printf("Среднее арифметическое -> %d \n", aver);
    }
    public static int minElem(ArrayList<Integer> data){
        return Collections.min(data);
    }

    public static int maxElem(ArrayList<Integer> data){
        return Collections.max(data);
    }

    public static int average(ArrayList<Integer> data){
        int result = 0;
        for (int n : data){
            result += n;
        }
        return result / data.size();
    }
}
