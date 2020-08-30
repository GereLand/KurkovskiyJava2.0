package Homework7;

public class Calculation2 {

    private static double result = 0;

    public static double addition(double operand1, double operand2) {

        try {
            result = operand1 + operand2;
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
        return result;
    }

    public static double subtraction(double operand1, double operand2) {

        try {
            result = operand1 - operand2;
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
        return result;
    }

    public static double multiplication(double operand1, double operand2) {

        try {
            result = operand1 * operand2;
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
        return result;
    }

    public static double division(double operand1, double operand2) {

        try {
            result = operand1 / operand2;
        } catch (ArithmeticException exc) {
            System.out.println("Невозможно произвести операцию деления на ноль!");
        } catch (Exception exc) {
            System.out.println("В работе калькулятора произошла ошибка!");
        }
        return result;
    }
}
