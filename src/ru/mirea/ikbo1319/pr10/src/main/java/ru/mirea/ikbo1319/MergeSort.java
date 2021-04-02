package ru.mirea.ikbo1319;

public class MergeSort implements SortingAlgorithm{
    private String name;
    public MergeSort(String name) {
        this.name = name;
    }
    @Override
    public String doSort() {
        return "This is a " + name + " sort";
    }
}
