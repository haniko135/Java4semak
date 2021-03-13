package ru.mirea.ikbo1319.pr7;

import ru.mirea.ikbo1319.pr7.adapter.Adapter;
import ru.mirea.ikbo1319.pr7.adapter.RoundPin;
import ru.mirea.ikbo1319.pr7.adapter.SquareHole;
import ru.mirea.ikbo1319.pr7.adapter.SquarePin;
import ru.mirea.ikbo1319.pr7.decorator.Car;
import ru.mirea.ikbo1319.pr7.decorator.Conditioner;
import ru.mirea.ikbo1319.pr7.decorator.Golf;

public class TestPR7 {
    public static void main (String[] args){
        SquareHole squareHole = new SquareHole(10);
        SquarePin squarePin = new SquarePin(10);
        if (squareHole.fits(squarePin)){
            System.out.println("Wow, it works!");
        }

        RoundPin roundPin = new RoundPin(3);
        Adapter roundPinAdapter = new Adapter(roundPin);
        if(squareHole.fits(roundPinAdapter)){
            System.out.println("WOW IT ALSO WORKS");
        }

        Car golfCar = new Golf();
        golfCar = new Conditioner(golfCar);
        System.out.println(golfCar.getPrice());
        System.out.println(golfCar.getNameModel());

        System.out.println("OH MY GOD IT'S WORKING");
    }
}
