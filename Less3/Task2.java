package Less3;

import java.util.*;

public class Task2 {
    //    Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 4, 6, 8, 5, 8, 4, 6, 87, 5, 3, 4);
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if ((it.next()) % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}