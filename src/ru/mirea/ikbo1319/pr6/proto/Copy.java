package ru.mirea.ikbo1319.pr6.proto;

public class Copy implements Cloneable {
    private int width;
    private int height;

    public Copy(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public Copy clone() throws CloneNotSupportedException{
        return (Copy) super.clone();
    }

    @Override
    public String toString() {
        return "Copy{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
