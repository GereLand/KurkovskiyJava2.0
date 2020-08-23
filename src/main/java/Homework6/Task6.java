package Homework6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        ArrayList<String> workWithFile;
        workWithFile = (ArrayList<String>) read();
        printTextFile(workWithFile);
        System.out.println("\n" + "------------------------------" + "\n");
        sort(workWithFile);
        System.out.println("\n" + "------------------------------" + "\n");
        counting(workWithFile);
        System.out.println("\n" + "------------------------------" + "\n");

    }

    private static List<String> read() throws FileNotFoundException {

        ArrayList<String> workWithFile = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Homework6/Task6-1.txt"));

        try {
            workWithFile.add(reader.readLine());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {

            try {
                reader.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return workWithFile;
    }

    private static void printTextFile(ArrayList<String> workWithFile) {

        for (String file : workWithFile) {
            System.out.println(file);
        }

    }

    private static void sort(List<String> sortFile) {

        String stringFile = sortFile.get(0);
        String[] strings = stringFile.split(" ");

        List<String> sortFile2 = new ArrayList<>(strings.length);
        sortFile2.addAll(Arrays.asList(strings).subList(0, strings.length));

        Collections.sort(sortFile2);
        System.out.println(sortFile2);

    }

    private static void counting(List<String> countingFile) {



    }
}
