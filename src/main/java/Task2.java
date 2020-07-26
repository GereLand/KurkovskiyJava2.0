import java.util.Scanner;

public class Task2 {
    /**
     * Задание №2
     * <p>
     * 1. Начинаем писать калькулятор:
     * <p>
     * Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc
     * при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять
     * до 4-х знаков после запятой.
     * <p>
     * 2. Запушить проект в свой репозиторий на GitHub
     * <p>
     * *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
     */
    public static void main(String[] args) {
        calculator();
    }

    public static String calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        double operand1 = scan.nextDouble();
        System.out.print("Введите знак арифметической операции: ");
        String sign = scan.next();
        System.out.print("Введите значение переменной В: ");
        double operand2 = scan.nextDouble();
        if ("+".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.4f%n%n"), (operand1 + operand2));
        } else if ("-".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.4f%n%n"), (operand1 - operand2));
        } else if ("*".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.4f%n%n"), (operand1 * operand2));
        } else if ("/".equals(sign)) {
            if (operand2 != 0)
                System.out.printf("Результат вычисления = " + ("%-10.4f%n%n"), (operand1 / operand2));
            else System.out.println("Невозможно произвести операцию деления на ноль!");
        } else {
            System.out.print("Введено некорректное значение!");
        }
        return "Завершена работа калькулятора.";
    }
}