package Homework4;

public class Candies implements NewYearGift {

    @Override
    public String name() {
        return "Конфеты";
    }

    @Override
    public double weight() {
        return 0.5;
    }

    @Override
    public int price() {
        return 1100;
    }

    @Override
    public String uniqueParameter() {
        return "Конфетное ассорти";
    }
}
