package ru.mirea.ikbo1319.pr5;

public class PR5_3 {
    private PR5_3 instance;
    private PR5_3(){};

    public synchronized PR5_3 getInstance() {
        if (instance == null){
            instance = new PR5_3();
        }
        return instance;
    }
}
