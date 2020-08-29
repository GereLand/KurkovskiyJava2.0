package Homework4;

public class Task4_1 {
    /**
     * Задание №4
     * <p>
     * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
     * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
     */
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * (20 + 1)) - 10;
        }

        int max = randomArray[0];
        int j1 = 0;
        for (int i1 = 1; i1 < randomArray.length; i1++) {
            if (randomArray[i1] > max) {
                max = randomArray[i1];
                j1 = i1;
            }
        }



//        Для проверки правильности выполнения задания сделал вывод массива в консоль
//        for (int value : randomArray) {
//            System.out.println(value);
//        }



        // Поиск максимального отрицательного элемента
        int maxNegative = -10;
        for (int indexMaxNegative = 1; indexMaxNegative < randomArray.length; indexMaxNegative++) {
            if (randomArray[indexMaxNegative] > maxNegative && randomArray[indexMaxNegative] < 0) {
                maxNegative = randomArray[indexMaxNegative];
            }
        }
        System.out.println("Максимальный отрицательный элемент: " + maxNegative);



        // Поиск минимального положительного элемента
        int minPositive = 10;
        for (int indexMinPositive = 1; indexMinPositive < randomArray.length; indexMinPositive++) {
            if (randomArray[indexMinPositive] < minPositive && randomArray[indexMinPositive] >= 0) {
                minPositive = randomArray[indexMinPositive];
            }
        }
        System.out.println("Минимальный положительный элемент: " + minPositive);



        int min = randomArray[0];
        int j2 = 0;
        for (int i2 = 1; i2 < randomArray.length; i2++) {
            if (randomArray[i2] < min) {
                min = randomArray[i2];
                j2 = i2;
            }
        }
        randomArray[j1] = min;
        randomArray[j2] = max;



//        Для проверки правильности выполнения задания сделал вывод массива в консоль
//        System.out.println("\n" + "------------------------------");
//        System.out.println();
//        for (int value : randomArray) {
//            System.out.println(value);
//        }
    }
}
