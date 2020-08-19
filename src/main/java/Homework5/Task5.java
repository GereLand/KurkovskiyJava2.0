package Homework5;

import java.util.Scanner;

public class Task5 {
    /**
     * Задание №5:
     * <p>
     * Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        double operand1 = scan.nextDouble();
        System.out.print("Введите знак арифметической операции: ");
        String sign = scan.next();
        System.out.print("Введите значение переменной В: ");
        double operand2 = scan.nextDouble();

        Calculation calculation = new Calculation();

        if ("+".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), calculation.addition(operand1, operand2));
        } else if ("-".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), calculation.subtraction(operand1, operand2));
        } else if ("*".equals(sign)) {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), calculation.multiplication(operand1, operand2));
        } else if ("/".equals(sign)) {
            if (operand2 != 0)
                System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), calculation.division(operand1, operand2));
            else System.out.println("Невозможно произвести операцию деления на ноль!");
        } else {
            System.out.print("Введено некорректное значение!");
        }
    }
}
