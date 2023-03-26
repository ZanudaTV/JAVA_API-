package Less4;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    //В калькулятор добавьте возможность отменить последнюю операцию.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        st.push("no result !!!");
        float res  ;
        String str ;
        String[] strNums;
        float firstNum ;
        float secondNum ;

        do {
            System.out.println("\nFor exit put - Q and for previos result - B ");
            System.out.print("Enter an expression to calculate ->  ");
            str = in.nextLine().strip();
            if (str.equals("Q")) {
                in.close();
                return;
            }
            if (str.equals("B")) {

                String last = st.pop();
                if (last.equals("no result !!!")) {
                    st.push(last);
                }
                System.out.println("Previos result was: " + st.peek());
                continue;
            }
            try {
                strNums = str.split("\\s*(\\+|-|\\*|/)\\s*");
                firstNum = Integer.parseInt(strNums[0]);
                secondNum = Integer.parseInt(strNums[1]);
            } catch (Exception e) {
                System.out.println("is not an arithmetic expression, try again");
                continue;
            }

            res = getResult(str, firstNum, secondNum);
            st.push(Float.toString(res));
            System.out.println(" = " + res);

        } while (true);

    }


    private static float getResult(String str, float firstNum, float secondNum) {
            float result = 0;

        for (char item : str.toCharArray()) {
            switch (item) {
                case '+' -> result = firstNum + secondNum;
                case '-' -> result = firstNum - secondNum;
                case '*' -> result = firstNum * secondNum;
                case '/' -> {
                    if (secondNum != 0) {
                        result = firstNum / secondNum;
                    } else {
                        System.out.println("деление на ноль");
                    }
                }
                default -> {
                }
            }
        }
        return result;
    }
}
