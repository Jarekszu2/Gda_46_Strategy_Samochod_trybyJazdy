package com.sda.dp.strategy.cars;

public class Main {
    public static void main(String[] args) {
        System.out.println();

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
        c.setMode(new TurboMode());
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.decreaseSpeed();
        c.setMode(new NormalMode());
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.increaseSpeed();
        c.decreaseSpeed();

        System.out.println("Speed: " + c.getSpeed());

        System.out.println();
        c.printUsage();
    }
}
