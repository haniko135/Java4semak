package ru.mirea.ikbo1319.pr4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PR4 {

    public static void main(String[] args){
        Thread one = new Thread(()->{
           for (int i = 0; i < 10; i++){
               System.out.print(i + " ");
           }
        });
        Thread two = new Thread(()->{
            for(int i = 10; i < 20; i++){
                System.out.print(i + " ");
            }
        });
        Thread three = new Thread(()->{
            for(int i = 20; i < 30; i++){
                System.out.print(i + " ");
            }
        });
        Thread four = new Thread(()->{
            for(int i = 30; i < 40; i++){
                System.out.print(i + " ");
            }
        });

        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        executorService.execute(one);   //первый поток
        executorService.execute(two);   //второй поток
        executorService.execute(three); //третий поток
        executorService.execute(four);  //четвёртый поток

        executorService.shutdown();
    }
}
