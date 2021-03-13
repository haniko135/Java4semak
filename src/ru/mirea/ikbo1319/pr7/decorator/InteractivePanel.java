package ru.mirea.ikbo1319.pr7.decorator;

public class InteractivePanel extends CarDecorator{     // доп опция от декоратора
    Car car;

    public InteractivePanel(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 3000;
    }

    @Override
    public String getNameModel() {
        return car.nameModel + " with interactive panel";
    }
}
