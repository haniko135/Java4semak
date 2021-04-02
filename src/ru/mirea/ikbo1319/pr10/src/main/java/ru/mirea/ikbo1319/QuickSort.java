package ru.mirea.ikbo1319;

public class QuickSort implements SortingAlgorithm{
    private String name;

    public QuickSort(String name) {
        this.name = name;
    }

    @Override
    public String doSort() {
        return "This is a " + name + " sort";
    }
}
