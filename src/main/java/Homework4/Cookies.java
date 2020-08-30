package Homework4;

public class Cookies implements NewYearGift {

    @Override
    public String name() {
        return "Печеньки";
    }

    @Override
    public double weight() {
        return 0.9;
    }

    @Override
    public int price() {
        return 700;
    }

    @Override
    public String uniqueParameter() {
        return "Печеньки из коробки для хранения ниток";
    }
}
