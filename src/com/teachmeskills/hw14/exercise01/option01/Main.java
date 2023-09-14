package com.teachmeskills.hw14.exercise01.option01;

public class Main {
    public static void main(String[] args) {
        int numThreads = 3;

        Thread[] threads = new Thread[numThreads];

        threads[0] = createThread("Завтрак", () -> {
            performAction("яичница с беконом", 4_000, 3);
        });

        threads[1] = createThread("Новости", () -> {
            performAction("чтение новостей", 5_500, 3);
        });

        threads[2] = createThread("Кофе", () -> {
            performAction("кофе с молоком", 2_000, 3);
        });

        for (Thread thread : threads) {
            thread.start();
        }
    }

    private static Thread createThread(String name, Runnable action) {
        Thread thread = new Thread(action);
        thread.setName(name);
        thread.setPriority(Thread.NORM_PRIORITY);
        return thread;
    }

    private static void performAction(String actionDescription, int sleepTime, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + actionDescription);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
