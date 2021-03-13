package ru.mirea.ikbo1319.pr7.decorator;

public class Mersedes extends Car{
    public Mersedes() {
        nameModel = "Mersedes";
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
