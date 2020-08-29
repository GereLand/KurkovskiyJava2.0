package Homework4;

public class Task4_2 {
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

    private static String[] Candys = {"Конфеты", "0.5", "1000", "Конфетное ассорти"};
    private static String[] Jellybeans = {"Мармеладки", "0.3", "500", "Мармеладные мишки с колой"};
    private static String[] Cookies = {"Печеньки", "1", "700", "Печеньки из коробки для хранения ниток"};

    public static void main(String[] args) {

        double weight = Double.parseDouble(Candys[1]) + Double.parseDouble(Jellybeans[1]) + Double.parseDouble(Cookies[1]);
        int price = Integer.parseInt(Candys[2]) + Integer.parseInt(Jellybeans[2]) + Integer.parseInt(Cookies[2]);

        System.out.println("Состав новогоднего подарка:");
        System.out.println(Candys[0] + " " + Candys[1] + "кг за " + Candys[2] + " руб. (" + Candys[3] + ")");
        System.out.println(Jellybeans[0] + " " + Jellybeans[1] + "кг за " + Jellybeans[2] + " руб. (" + Jellybeans[3] + ")");
        System.out.println(Cookies[0] + " " + Cookies[1] + "кг за " + Cookies[2] + " руб. (" + Cookies[3] + ")");
        System.out.println("Общий вес посылки = " + weight + " кг.");
        System.out.println("Общая стоимость посылки = " + price + " руб.");
    }
}
