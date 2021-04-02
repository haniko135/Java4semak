package ru.mirea.ikbo1319;

public class InsertionSort implements SortingAlgorithm{
    private String name;

    public InsertionSort(String name) {
        this.name = name;
    }

    @Override
    public String doSort() {
        return "This is a " + name + " sort";
    }
}
