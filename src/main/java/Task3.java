import java.util.Scanner;

public class Task3 {
    /**
     * Задание №3
     * <p>
     * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания (Задание выполнено сразу в Task2)
     * <p>
     * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна,
     * задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном
     * массиве необходимо найти самое длинное слово. Результат вывести на консоль
     * <p>
     * 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение
     * калькулятора, если 2 - поиск максимального слова в массиве.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 1 для использования калькулятора или 2 для поиска максимального элемента в массиве: ");
        int tool = scan.nextInt();
        if (tool == 1)
            Task2.calculator();
        else
            System.out.println(maxWord());
    }

    public static String maxWord() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int N = scan.nextInt();
        String[] mas = new String[N];
        int x = 1;
        for (int y = 0; y < N; x++, y++) {
            System.out.print("Введите слово в ячейку массива №" + x + ": ");
            mas[y] = scan.next();
        }

        int maxLength = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length() > maxLength) {
                maxLength = mas[i].length();
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length() == maxLength) {
                System.out.println(mas[i]);
            }
        }
        return "Максимальный элемент в массиве имеет длину " + maxLength + " символов.";
    }
}
