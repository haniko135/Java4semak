package ru.mirea.ikbo1319.pr7.adapter;

public class SquareHole {
    private double width;

    public SquareHole(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return width*width;
    }

    public boolean fits (SquarePin pin){
        return this.getWidth() >= pin.getWidth();
    }
}
