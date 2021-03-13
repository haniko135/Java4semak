package ru.mirea.ikbo1319.pr7.decorator;

public class Conditioner extends CarDecorator{
    Car car;

    public Conditioner(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 200;
    }

    @Override
    public String getNameModel() {
        return car.nameModel + " with conditioner";
    }
}
