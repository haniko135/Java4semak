package ru.mirea.ikbo1319.pr6.factoryMethod;

public class CreateHuman {
    public static RussianFactory createHuman(String nation){
        if (nation == "Russian"){
            return new RussianFactory();
        }
        return null;
    }
}
