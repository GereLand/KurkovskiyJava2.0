package Homework4;

public class Jellybeans implements NewYearGift {

    @Override
    public String name() {
        return "Мармеладки";
    }

    @Override
    public double weight() {
        return 0.3;
    }

    @Override
    public int price() {
        return 500;
    }

    @Override
    public String uniqueParameter() {
        return "Мармеладные мишки с колой";
    }
}
