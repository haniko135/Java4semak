package ru.mirea.ikbo1319.pr5;

public class PR5_1 {
    private static PR5_1 instance;
    private PR5_1(){};

    public static PR5_1 getInstance() {
        if(instance == null){
            instance = new PR5_1();
        }
        return instance;
    }
}

