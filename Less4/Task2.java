package Less4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Task2 {
//              Реализуйте очередь с помощью LinkedList со следующими методами:
//            • enqueue() — помещает элемент в конец очереди,
//            • dequeue() — возвращает первый элемент из очереди и удаляет его,
//            • first() — возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 7, 14, -5, 48, 87, 35, 3, 94);
        System.out.println(list);
        enqueue(list, 100);
        System.out.println("extended list: " + list);
        System.out.println();
        Integer firstElm = dequeue(list);
        System.out.println("first element : " + firstElm + " was deleted");
        System.out.println(list);
        System.out.println();
        System.out.println("first element of list : " + first(list));
        System.out.println(list);
    }
    public static void enqueue(LinkedList<Integer> list, Integer element) {
        list.add(element);
    }
    public static Integer dequeue(LinkedList<Integer> list) {
        Integer temp = list.getFirst();
        list.removeFirst();
        return temp;
    }
    public static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}