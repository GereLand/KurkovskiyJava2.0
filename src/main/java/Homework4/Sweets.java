package Homework4;

public class Sweets {

    private static double totalWeight;
    private static int totalPrice;

    public static void groupGift() {

        Cookies cookies = new Cookies();
        Jellybeans jellybeans = new Jellybeans();
        Candies candies = new Candies();

        totalWeight = cookies.weight() + jellybeans.weight() + candies.weight();
        totalPrice = cookies.price() + jellybeans.price() + candies.price();

    }

    static void showTotalWeight() {
        System.out.println("Общий вес подарка = " + totalWeight + " кг.");
    }

    static void showTotalCost() {
        System.out.println("Общая стоимость подарка = " + totalPrice + " руб.");
    }

    static void showCookies() {
        Cookies cookies = new Cookies();
        System.out.println(cookies.name() + " " + cookies.weight() + "кг за " + cookies.price() + " руб. (" + cookies.uniqueParameter() + ")");
    }

    static void showCandys() {
        Candies candies = new Candies();
        System.out.println(candies.name() + " " + candies.weight() + "кг за " + candies.price() + " руб. (" + candies.uniqueParameter() + ")");
    }

    static void showJellybeans() {
        Jellybeans jellybeans = new Jellybeans();
        System.out.println(jellybeans.name() + " " + jellybeans.weight() + "кг за " + jellybeans.price() + " руб. (" + jellybeans.uniqueParameter() + ")");
    }
}
