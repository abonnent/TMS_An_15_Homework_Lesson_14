package com.teachmeskills.hw14.exercise02;

public class CarCollector {
    private CarRepairShop repairShop;

    public CarCollector(CarRepairShop repairShop) {
        this.repairShop = repairShop;
    }

    public void collectCar() throws InterruptedException {
        repairShop.repairCar();
        System.out.println("Машина забрана из тех. осмотра.");
    }
}
