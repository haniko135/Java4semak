package ru.mirea.ikbo1319.pr6.factoryMethod;

public class RussianFactory implements HumanFactory{
    @Override
    public Woman createwomen() {
        return new RussianWoman();
    }

    @Override
    public Man createMan() {
        return new RussianMan();
    }
}
