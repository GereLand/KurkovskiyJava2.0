package Homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    /**
     * Задание №7
     * <p>
     * Добавить обработку исключений в задание с ООП калькуляторам
     * (например, исключение может возникнуть при делении на ноль)
     */

    private static double operand1;
    private static String sign;
    private static double operand2;

    public static void main(String[] args) {

        enteringValues1();

        Calculation2 calculation = new Calculation2();

        try {
            if ("+".equals(sign)) {
                calculation.addition(operand1, operand2);
            } else if ("-".equals(sign)) {
                calculation.subtraction(operand1, operand2);
            } else if ("*".equals(sign)) {
                calculation.multiplication(operand1, operand2);
            } else if ("/".equals(sign)) {
                calculation.division(operand1, operand2);
            } else
                System.out.print("Введено некорректное значение!");
        } catch (ArithmeticException e) {
            System.out.print("Введён некорректный знак арифметической операции!");
        }
    }

    private static void enteringValues1() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        try {
            operand1 = scan.nextDouble();
        } catch (InputMismatchException exс) {
            System.out.println("Вы вели некорректное значение переменной!");
            System.out.println("Памятка: необходимо ввести целочисленное значение или число с плавающей точкой!");
            System.out.print("Введите значение переменной А: ");
            scan = new Scanner(System.in);
            operand1 = scan.nextDouble();
        }

        System.out.print("Введите знак арифметической операции (\"+\", \"-\", \"*\", \"/\"): ");
        sign = scan.next();

        System.out.print("Введите значение переменной В: ");
        try {
            operand2 = scan.nextDouble();
        } catch (InputMismatchException exс) {
            System.out.println("Вы вели некорректное значение переменной!");
            System.out.println("Памятка: необходимо ввести целочисленное значение или число с плавающей точкой!");
            System.out.print("Введите значение переменной В: ");
            scan = new Scanner(System.in);
            operand2 = scan.nextDouble();
        }
    }
}

