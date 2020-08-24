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

    static List<String> sort(List<String> sortFile) {

        String stringFile = sortFile.get(0);
        String[] strings = stringFile.split(" ");

        List<String> sortFile2 = new ArrayList<>(strings.length);
        sortFile2.addAll(Arrays.asList(strings).subList(0, strings.length));

        Collections.sort(sortFile2);
        System.out.println(sortFile2);

        return sortFile2;
    }

    static void counting(List<String> countingFile) {

        for (int index = 0, count = 0; index < countingFile.size(); index++) {

            if (countingFile.get(index).equals(countingFile.get(index))) {

                do {
                    index++;
                    count++;

                } while (index < countingFile.size() && countingFile.get(index).equals(countingFile.get(index - 1))); {

                    if (count < countingFile.size()) {
                        System.out.println("Слово \"" + countingFile.get(index - 1) + "\" встречается в тексте: " + count + " раз.");
                        count = 0;
                    } else {
                        System.out.println("\n" + "------------------------------" + "\n");
                        System.out.println("Слово \"" + countingFile.get(index - 1) + "\" встречается максимальное количество раз.");
                    }
                }
            }
        }
    }
}
