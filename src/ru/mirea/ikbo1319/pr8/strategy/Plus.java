package ru.mirea.ikbo1319.pr8.strategy;

public class Plus implements Strategy {
    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
