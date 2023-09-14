package com.teachmeskills.hw14.exercise01.option02;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = {
                new Thread(new CoffeeRunnable("Завтрак", "яичница с беконом", 4_000, 3)),
                new Thread(new NewsRunnable("Новости", "чтение новостей", 5_500, 3)),
                new Thread(new BreakfastRunnable("Кофе", "кофе с молоком", 2_000, 3))
        };

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
