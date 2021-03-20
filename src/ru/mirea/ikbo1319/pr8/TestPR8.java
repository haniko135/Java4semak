package ru.mirea.ikbo1319.pr8;

import ru.mirea.ikbo1319.pr8.template_method.BiletPhysics;
import ru.mirea.ikbo1319.pr8.template_method.BiletTemplate;
import ru.mirea.ikbo1319.pr8.strategy.*;

public class TestPR8 {

    public static void main(String[] args) {
        Operation addOp = new Operation(new Plus());
        System.out.println("76,5 + 83 = " + addOp.chooseOperation(76.5,83));

        addOp = new Operation(new Divide());
        System.out.println("100 / 58 = " + addOp.chooseOperation(100, 58));

        addOp = new Operation(new SquareRootsSum());
        System.out.println("sqrt(678) + sqrt(1246) = " + addOp.chooseOperation(678, 1246));

        addOp = new Operation(new Power());
        System.out.println("7^8 = " + addOp.chooseOperation(7, 8));

        System.out.println(" ");

        BiletTemplate bilet = new BiletPhysics("Physics", 15);
        bilet.writeBilet();
    }
}
