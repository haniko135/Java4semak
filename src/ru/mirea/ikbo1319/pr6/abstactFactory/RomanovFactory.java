package ru.mirea.ikbo1319.pr6.abstactFactory;

public class RomanovFactory implements FamiliesFactory{
    @Override
    public King createKing() { return new RomanovKing(); }

    @Override
    public Queen createQueen() {
        return new RomanovQueen();
    }
}
