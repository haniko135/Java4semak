package ru.mirea.ikbo1319.pr8.template_method;

public class BiletMath extends BiletTemplate{
    public BiletMath(String name, int number) {
        super(name, number);
    }

    @Override
    void themeOfBilet() {
        System.out.println("Integrals");
    }
}
