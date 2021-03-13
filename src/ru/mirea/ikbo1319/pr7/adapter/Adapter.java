package ru.mirea.ikbo1319.pr7.adapter;

public class Adapter extends SquarePin{
    private RoundPin pin;

    public Adapter(RoundPin pin) {
        this.pin = pin;
    }

    @Override
    public double getWidth() {
        return 2*pin.getRadius();
    }
}
