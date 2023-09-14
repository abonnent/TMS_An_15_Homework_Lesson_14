package com.teachmeskills.hw14.exercise02;

public class CarRepairShop {
    private static final int MAX_CAPACITY = 5; // Максимальное количество машин в тех. осмотре
    private int currentCapacity = 0; // Текущее количество машин в тех. осмотре

    public synchronized void addCar() throws InterruptedException {
        while (currentCapacity >= MAX_CAPACITY) {
            System.out.println("Тех. осмотр заполнен. Ждем освобождения места.");
            wait();
        }

        currentCapacity++;
        System.out.println("Машина добавлена в тех. осмотр. Текущее количество: " + currentCapacity);
        notify();
    }

    public synchronized void repairCar() throws InterruptedException {
        while (currentCapacity == 0) {
            System.out.println("Тех. осмотр пуст. Ждем появления машин.");
            wait();
        }

        currentCapacity--;
        System.out.println("Машина отправлена после ремонта. Текущее количество: " + currentCapacity);
        notify();
    }
}
