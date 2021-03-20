package ru.mirea.ikbo1319.pr6;

import ru.mirea.ikbo1319.pr6.abstactFactory.CreateDynasty;
import ru.mirea.ikbo1319.pr6.builder.Pupil;
import ru.mirea.ikbo1319.pr6.builder.PupilBuilder;
import ru.mirea.ikbo1319.pr6.factoryMethod.CreateHuman;
import ru.mirea.ikbo1319.pr6.factoryMethod.HumanFactory;
import ru.mirea.ikbo1319.pr6.factoryMethod.RussianFactory;
import ru.mirea.ikbo1319.pr6.proto.Copy;

public class TestPR6 {

    public static void main(String[] args) throws CloneNotSupportedException{
        // First task
        CreateHuman.createHuman("Russian").createMan().callMan();
        System.out.println(" ");

        // Second task
        //Вызов императора Романовых
        CreateDynasty.makeDynasty("Romanov").createKing().callKing();
        //Вызов княгини Рюриковичей
        CreateDynasty.makeDynasty("Rurik").createQueen().callQueen();
        System.out.println(" ");

        // Third task
        Pupil pupil = new PupilBuilder().withStarosta().getPupil();
        System.out.println(pupil);

        System.out.println(" ");

        // Fourth task
        Copy copy1 = new Copy(145, 250);
        Copy copy2 = copy1.clone();
        System.out.println(copy1.toString());
        System.out.println(copy2.toString());
    }
}
