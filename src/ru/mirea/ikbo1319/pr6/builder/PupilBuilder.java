package ru.mirea.ikbo1319.pr6.builder;

public abstract class PupilBuilder {
    protected Pupil pupil;

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = new Pupil();
    }

    public abstract void status();
}
