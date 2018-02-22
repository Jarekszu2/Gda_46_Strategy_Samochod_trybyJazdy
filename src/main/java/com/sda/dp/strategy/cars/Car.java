package com.sda.dp.strategy.cars;

public class Car {
    private int speed;
    private double gasReleased; //
    private double engineWear; //
    private double breaksWear; //

    private IDriveMode mode;

    public Car() {
        this.speed = 0;
        this.gasReleased = 0;
        this.engineWear = 0;
        this.breaksWear = 0;
        this.mode = new TurboMode();
    }

    public void increaseSpeed(){
        speed += mode.getHowMuchSpeedToIncrease();
        gasReleased += mode.getHowMuchGasReleasedToIncrease();
        engineWear += mode.getHowMuchEngineWearToIncrease();
    }

    public void decreaseSpeed(){

    }

    public void setMode(IDriveMode mode) {
        this.mode = mode;
    }

    public void printUsage(){
        System.out.println("Gas: " + gasReleased);
        System.out.println("Engine: " + engineWear);
        System.out.println("Breaks: " + breaksWear);
        System.out.println("Speed: " + speed);
    }
}
