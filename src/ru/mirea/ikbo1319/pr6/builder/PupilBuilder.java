package ru.mirea.ikbo1319.pr6.builder;

public class PupilBuilder {
    protected Pupil pupil;

    public PupilBuilder() {
        this.pupil = new Pupil();
    }

    public Pupil getPupil() {
        return pupil;
    }

    public PupilBuilder withStarosta(){
        pupil.setTrait(new Starosta());
        return this;
    };
}
