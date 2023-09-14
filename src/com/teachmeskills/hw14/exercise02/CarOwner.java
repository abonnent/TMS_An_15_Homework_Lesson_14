package com.teachmeskills.hw14.exercise02;

public class CarOwner {
    private CarRepairShop repairShop;

    public CarOwner(CarRepairShop repairShop) {
        this.repairShop = repairShop;
    }

    public void bringCar() throws InterruptedException {
        repairShop.addCar();
        System.out.println("Машина привезена на тех. осмотр.");
    }
}
