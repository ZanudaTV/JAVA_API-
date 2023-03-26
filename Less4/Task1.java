package Less4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Task1 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 6, 14, 26, 58, -5, 48, 74, 6, 87, 35, 3, 94);
        System.out.println(list);
        System.out.println(reversed(list));

    }

    private static LinkedList<Integer> reversed(LinkedList<Integer> list) {
        LinkedList<Integer> newlist = new LinkedList<>();
        for (int i = list.size() -1; i >= 0 ; i--) {
            newlist.add(list.get(i));
        }
        return newlist;
    }
}