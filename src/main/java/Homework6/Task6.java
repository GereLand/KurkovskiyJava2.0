package Homework6;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Task6 {

    /**
     * Задание №6:
     * <p>
     * Есть входной файл с набором слов, написанных через пробел
     * Необходимо:
     * Прочитать слова из файла.
     * Отсортировать в алфавитном порядке.
     * Посчитать сколько раз каждое слово встречается в файле.
     * Вывести статистику на консоль
     * Найти слово с максимальным количеством повторений.
     * Вывести на консоль это слово и сколько раз оно встречается в файле
     */

    public static void main(String[] args) throws FileNotFoundException {

        Task6_1 collection = new Task6_1();
        ArrayList<String> workWithFile;
        workWithFile = (ArrayList<String>) collection.read();
        collection.printTextFile(workWithFile);
        System.out.println("\n" + "------------------------------" + "\n");
        workWithFile = (ArrayList<String>) collection.sort(workWithFile);
        System.out.println("\n" + "------------------------------" + "\n");
        collection.counting(workWithFile);

    }
}
