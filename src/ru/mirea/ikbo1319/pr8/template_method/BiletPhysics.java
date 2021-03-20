package ru.mirea.ikbo1319.pr8.template_method;

public class BiletPhysics extends BiletTemplate{
    public BiletPhysics(String name, int number) {
        super(name, number);
    }

    @Override
    void themeOfBilet() {
        System.out.println("Molecular physics");
    }
}
