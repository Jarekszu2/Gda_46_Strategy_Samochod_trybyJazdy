package com.sda.dp.strategy.cars;

public class EcoMode implements IDriveMode {

    public int getHowMuchSpeedToIncrease() {
        return 3;
    }

    public double getHowMuchGasReleasedToIncrease() {
        return 0.01;
    }

    public double getHowMuchEngineWearToIncrease() {
        return 0.01;
    }
}
