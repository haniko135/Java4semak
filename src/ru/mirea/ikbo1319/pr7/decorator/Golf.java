package ru.mirea.ikbo1319.pr7.decorator;

public class Golf extends Car{
    public Golf() {
        nameModel = "Golf";
    }

    @Override
    public int getPrice() {
        return 8000;
    }
}
