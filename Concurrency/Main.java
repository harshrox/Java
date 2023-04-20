package com.gamingz.Concurrency;

public class Main {
    public static void main(String[] args) {
        // worker thread
        Thread thread = new Thread(new Runnable() {      // The constructor of Thread object requires an interface called new Runnable()
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println("Printing "+i+" in a worker thread");
                    try {                               // To tackle exceptions
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread.start();

        // main thread
        for (int i=0;i<5;i++){
            System.out.println("Printing "+i+" in main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
