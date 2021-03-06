package ru.mirea.ikbo1319.pr1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public Scanner scanner = new Scanner(System.in);
    final Random random = new Random();

    Main(){
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int i =  random.nextInt(20) + 1;
        for (int k = 0; k < i; k++){
            array1.add(random.nextInt(100));
        }
        int o = random.nextInt(30) + 1;
        for (int k = 0; k < o; k++){
            array2.add(random.nextInt(100));
        }
        for(int j = 0; j < array1.size(); j++){
            System.out.print(array1.get(j) + " ");
        }
        System.out.println(" ");
        for(int j = 0; j < array2.size(); j++){
            System.out.print(array2.get(j) + " ");
        }
        System.out.println(" ");

        //не понимаю как сравнить 2 массива: элемент-элемент или элемент-размер массива
        Comparator<ArrayList<Integer>> comparator = (arr1, arr2) ->{
            Integer o1 = arr1.size();
            Integer o2 = arr2.size();
            return o1.compareTo(o2);
        };

        System.out.println(comparator.compare(array1, array2));

    }

    public static void main(String[] args) {
	    new Main();
    }
}
