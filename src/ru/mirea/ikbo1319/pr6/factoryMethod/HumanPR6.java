package ru.mirea.ikbo1319.pr6.factoryMethod;

public class HumanPR6 {
    public static HumanNation getHumanPR6(String nation){
        if(nation == "Russian"){
            return new RussianHuman();
        }
        else if(nation == "English"){
            return new EnglishHuman();
        }
        else if (nation == "Ukrainian") {
            return new UkrainianHuman();
        }
        return null;
    }
}
