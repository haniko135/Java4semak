package ru.mirea.ikbo1319.pr6.builder;

public class Otlichnik {
    private PupilBuilder otlichnik;

    public Pupil getOtlichnik() {
        return otlichnik.getPupil();
    }

    public void setOtlichnik(PupilBuilder otlichnik) {
        this.otlichnik = otlichnik;
    }

}
