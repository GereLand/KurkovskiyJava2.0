package Homework4;

public class Task4_2 extends Sweets{
    /**
     * Задание №4
     * <p>
     * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
     * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
     * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
     */

    /*
    Ячейки массивов:
    1. Название (Name);
    2. Вес (Weight);
    3. Цена (Price);
    4. Уникальный параметр (Unique parameter).
     */

    public static void main(String[] args) {

        groupGift();
        showTotalWeight();
        showTotalCost();
        System.out.println("Состав новогоднего подарка:");
        showCandys();
        showJellybeans();
        showCookies();

    }
}
