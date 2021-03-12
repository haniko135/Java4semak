package ru.mirea.ikbo1319.pr6.abstactFactory;

public class CreateDynasty {
    public static FamiliesFactory makeDynasty(String dynastyName){
        if (dynastyName == "Romanov"){
            return new RomanovFactory();
        }
        else if(dynastyName == "Rurik"){
            return new RurikFactory();
        }
        return null;
    }
}
