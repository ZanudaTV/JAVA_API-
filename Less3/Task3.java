package Less3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    //    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 6, 14, 26, 58, -5, 48, 74, 6, 87, 35, 3, 94);
        int min = list.get(0);
        int max = min;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) > max) {
                max = list.get(i);
            } else if (list.get(i) < min) {
                min = list.get(i);

            }
        }
        System.out.printf("minimum : %d ,maximum : %d, mean : %.2f", min, max, sum / list.size());
    }
}