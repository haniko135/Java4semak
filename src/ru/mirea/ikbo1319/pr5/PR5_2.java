package ru.mirea.ikbo1319.pr5;

public class PR5_2 {
    private static PR5_2 instance= new PR5_2();

    private PR5_2(){};
    public static PR5_2 getInstance() {
        return instance;
    }
}
