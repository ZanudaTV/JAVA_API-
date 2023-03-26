package Less2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class Task2 {
    //    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("Log.txt", false);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = {1, 2, 5, 8, 55, 7, 443, 32, 9};
        int temp;
        logger.info("start sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                logger.info("check " + j + " element = " + arr[j]);
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    logger.info("swap " + arr[j+1] + " and " + arr[j]);
                }
            }
        }
        logger.info("end sort");
        System.out.println(Arrays.toString(arr));
    }
}