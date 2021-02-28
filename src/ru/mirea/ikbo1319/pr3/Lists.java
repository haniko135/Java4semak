package ru.mirea.ikbo1319.pr3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class Lists {
    public static List<String> getPeopleAteez(){
        List<String> ATEEZ = new ArrayList<String>();

        ATEEZ.add("Park Seong Hwa");
        ATEEZ.add("Kim Hong Joong");
        ATEEZ.add("Jeong Yun Ho");
        ATEEZ.add("Kang Yeo Sang");
        ATEEZ.add("Choi San");
        ATEEZ.add("Son Min-gi");
        ATEEZ.add("Jung Woo Young");
        ATEEZ.add("Choi Jongho");

        return ATEEZ;
    }

    public static List<String> getPeopleSKZ(){
        List<String> StrayKids = new ArrayList<String>();

        StrayKids.add("Bang Chan");
        StrayKids.add("Li Min-ho");
        StrayKids.add("Seo Chang-bin");
        StrayKids.add("Hwang Hyun-jin");
        StrayKids.add("Han Ji Sung");
        StrayKids.add("Lee Felix");
        StrayKids.add("Kim Seungmin");
        StrayKids.add("Yan Jeong In");

        return StrayKids;
    }


    private static Semaphore semaphore = new Semaphore(1);
    public static void run(List<String>array, int i){
        try {
            semaphore.acquire();
            System.out.println(array.get(i));
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static void print(Map <Integer,String> groups, int i){
        System.out.println(groups.get(i));
    };


    public static void main(String[] args){
        List<String> ATEEZmembers = getPeopleAteez();
        List<String> SKZmembers = getPeopleSKZ();

        Thread one = new Thread(()->{
            for(int i = 0; i < ATEEZmembers.size(); i++) {
                run(ATEEZmembers, i);
            }
        });

        Thread two = new Thread(()->{
            for(int i = 0; i < SKZmembers.size(); i++){
                run(SKZmembers, i);
            }
        });

        one.start();
        System.out.println(" ");
        two.start();


        Map<Integer, String> kpopGroups = new HashMap<Integer, String>();
        kpopGroups.put(1, "BTS");
        kpopGroups.put(2, "SHINee");
        kpopGroups.put(3, "Big Bang");
        kpopGroups.put(4, "EXO");
        kpopGroups.put(5, "GOT7");
        kpopGroups.put(6, "BLACKPINK");
        kpopGroups.put(7, "MONSTA X");
        kpopGroups.put(8, "MOMOLAND");
        kpopGroups.put(9, "TWICE");
        kpopGroups.put(10, "MAMAMOO");

        System.out.println(" ");
        Thread three = new Thread(()->{
            for (int i = 1; i < kpopGroups.size()+1; i++){
                print(kpopGroups, i);
            }
        });
        three.start();

    }


}
