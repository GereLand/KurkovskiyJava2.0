package Homework6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task6_1 {

    static List<String> read() throws FileNotFoundException {

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

    static void printTextFile(ArrayList<String> workWithFile) {

        for (String file : workWithFile) {
            System.out.println(file);
        }

    }

    static List<String> sort(ArrayList<String> sortFile) {

        String stringFile = sortFile.get(0);
        String[] strings = stringFile.split(" ");

        List<String> sortFile2 = new ArrayList<>(strings.length);
        sortFile2.addAll(Arrays.asList(strings).subList(0, strings.length));

        Collections.sort(sortFile2);
        System.out.println(sortFile2);

        return sortFile2;
    }

    static void counting(ArrayList<String> countingFile) {

        int index, index2, count, count2;
        String maxWord;

        for (index = 0, index2 = 0, count = 0, count2 = 0, maxWord = null; index < countingFile.size(); index++) {

            if (index2 < countingFile.size()) {

                do {
                    index2++;
                    count++;

                } while (index2 < countingFile.size() && countingFile.get(index2).equals(countingFile.get(index2 - 1)));
                {
                    System.out.println("Слово \"" + countingFile.get(index2 - 1) + "\" встречается в тексте: " + count + " раз.");

                    if (count > count2 && index2 <= countingFile.size()) {

                        count2 = count;
                        maxWord = countingFile.get(index2);

                    }
                    count = 0;
                }

            } else {
                break;
            }
        }

        System.out.println("\n" + "------------------------------" + "\n");
        System.out.println("Слово \"" + maxWord + "\" встречается максимальное количество раз. (" + count2 + ") раз.");

    }
}
