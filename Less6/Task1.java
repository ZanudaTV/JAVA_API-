package Less6;

import java.io.IOException;
import java.util.*;

public class Task1 {

    public static void main(String[] args) throws Exception {
        List<Notebook> list = new ArrayList<>();

        Notebook note1 = new Notebook("lenova", 17.0, "i5", "windows", 8, 128);
        Notebook note2 = new Notebook("asus", 15.6, "i7", "windows", 16, 128);
        Notebook note3 = new Notebook("hp", 15.6, "i3", "linux", 8, 128);
        Notebook note4 = new Notebook("macbook", 13.3, "i5", "ios", 8, 254);
        Notebook note5 = new Notebook("macbook", 13.3, "i3", "ios", 4, 128);
        Notebook note6 = new Notebook("macbook", 15.6, "i7", "ios", 16, 128);
        Notebook note7 = new Notebook("acer", 15.6, "i3", "windows", 4, 128);

        Collections.addAll(list, note1, note2, note3, note4, note5, note6, note7);

        System.out.print("""
                1 - модель
                2 - диогональ экрана
                3 - процессор
                4 - операционная система
                5 - оперативная память
                6 - объем накопителя
                введите критерии сортировки через пробел:\s""");

        Scanner in = new Scanner(System.in);
        String[] choice = in.nextLine().split(" ");

        try {
            for (String str : choice) {
                switch (str) {
                    case "1" -> {
                        System.out.print("введите модель (acer, lenova, hp, asus, macbook): ");
                        modelSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);

                    }
                    case "2" -> {
                        System.out.print("введите размер диогонали (13.3, 15.6, 17.0): ");
                        sizeSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);
                    }
                    case "3" -> {
                        System.out.print("введите модель процессора (i3, i5, i7): ");
                        cpuSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);
                    }
                    case "4" -> {
                        System.out.println("введите операционную систему (linux, windows, ios): ");
                        osSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);
                    }
                    case "5" -> {
                        System.out.print("введите объем ОЗУ(4, 8, 16, 32): ");
                        ramSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);
                    }
                    case "6" -> {
                        System.out.print("введите объем накопителя(128, 254, 512, 1024): ");
                        ssdSort(list, in.next().toLowerCase());
                        list.forEach(System.out::println);
                    }
                    default -> throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("введены не корректные данные!!!");
        }

        in.close();
    }

    private static void modelSort(List<Notebook> list, String str) {

        list.removeIf(item -> !str.equals(item.getModel()));
    }

    private static void sizeSort(List<Notebook> list, String str) {

        list.removeIf(item -> !str.equals(item.getSize().toString()));

    }

    private static void cpuSort(List<Notebook> list, String str) {

        list.removeIf(item -> !str.equals(item.getCpu()));
    }

    private static void osSort(List<Notebook> list, String str) {
        list.removeIf(item -> !str.equals(item.getOs()));
    }

    private static void ramSort(List<Notebook> list, String str) {

        list.removeIf(item -> !(item.getRam() == Integer.parseInt(str)));
    }

    private static void ssdSort(List<Notebook> list, String str) {

        list.removeIf(item -> !(item.getSsd() == Integer.parseInt(str)));
    }
}
