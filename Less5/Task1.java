package Less5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        // что 1 человек может иметь несколько телефонов.

        Map<String, List<String>> dict = new HashMap<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("enter name of back for exit: ");
            String name = in.next();

            if (name.equals("back")) break;

            System.out.print("enter phone : ");
            List<String> tempList = new ArrayList<>();
            String phone = in.next();

            if (dict.containsKey(name)) {
                tempList.addAll(dict.get(name));
                tempList.add(phone);
                dict.put(name, tempList);

            } else {
                tempList.add(phone);
                dict.put(name, tempList);
            }


        }
        System.out.println(Arrays.asList(dict));

    }

}
