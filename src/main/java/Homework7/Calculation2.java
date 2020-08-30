package Homework7;

public class Calculation2 {

    static void addition(double operand1, double operand2) {

        try {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), operand1 + operand2);
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
    }

    static void subtraction(double operand1, double operand2) {

        try {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), operand1 - operand2);
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
    }

    static void multiplication(double operand1, double operand2) {

        try {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), operand1 * operand2);
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
    }

    static void division(double operand1, double operand2) {

        try {
            System.out.printf("Результат вычисления = " + ("%-10.2f%n%n"), operand1 / operand2);
        } catch (ArithmeticException exc) {
            System.out.println("Невозможно произвести операцию деления на ноль!");
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
    }
}
