package ru.mirea.ikbo1319.pr2;

import java.time.LocalDate;
import java.time.Period;

public class Human {
    private int age;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private int weight;
    LocalDate dateNow = LocalDate.of(2021, 2, 21);

    public Human(String lastName, String firstName, LocalDate birthDate, int weight) {
        this.age = Period.between(birthDate,dateNow).getYears();
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(LocalDate birthDate, LocalDate dateNow) {
        this.age = Period.between(birthDate,dateNow).getYears();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Last name='" + lastName + '\'' +
                ", First name='" + firstName + '\'' +
                ", age=" + age +
                ", birth date=" + birthDate +
                ", weight=" + weight;
    }
}
