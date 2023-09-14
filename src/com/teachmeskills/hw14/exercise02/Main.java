package com.teachmeskills.hw14.exercise02;

public class Main {
    public static void main(String[] args) {
        CarRepairShop repairShop = new CarRepairShop();
        CarCollector collector = new CarCollector(repairShop);
        CarOwner owner = new CarOwner(repairShop);

        Thread carOwnerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    owner.bringCar();
                    Thread.sleep(1000); // Пауза между привозом машин
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread carCollectorThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    collector.collectCar();
                    Thread.sleep(2000); // Пауза между забором машин
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        carOwnerThread.start();
        carCollectorThread.start();
    }
}
