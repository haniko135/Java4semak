package ru.mirea.ikbo1319.pr6.abstactFactory;

public class RurikFactory implements FamiliesFactory{
    @Override
    public King createKing() { return new RurikKing(); }

    @Override
    public Queen createQueen() { return new RurikQueen(); }
}
