package ru.mirea.ikbo1319.pr7.decorator;

public abstract class Car {                 //само описание машины
    String nameModel = "Some name";

    public String getNameModel() {
        return nameModel;
    }
    public abstract int getPrice();
}
