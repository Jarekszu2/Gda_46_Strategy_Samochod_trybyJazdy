package com.sda.dp.strategy.cars;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.setMode(new EcoMode());

        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();

        c.printUsage();
    }
}
