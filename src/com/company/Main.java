package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10000; j++){
            new MyThread().start();
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger);
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}

// If there is a primitive variable which we want to use between several threads, we can utilize atomic Integers